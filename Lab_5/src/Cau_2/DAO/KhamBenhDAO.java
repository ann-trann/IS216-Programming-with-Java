/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.DTO.KhamBenhDTO;
import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trant
 */
public class KhamBenhDAO {

    private KhamBenhDTO khamBenhDTO;
    private Connection con;

    public KhamBenhDAO() {
        khamBenhDTO = new KhamBenhDTO();
        this.con = OracleConnection.getInstance().getConnection();
    }
    
    public String layMaxMaKB() throws SQLException {
        String maxMaKB = "";
        String sql = "SELECT MAX(MaKB) AS MaxMaKB FROM KHAMBENH";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            maxMaKB = rs.getString("MaxMaKB");
        }
        return maxMaKB;
    }
    
    public void insertKhamBenh(KhamBenhDTO kb) throws SQLException {
        String sql = "INSERT INTO KHAMBENH(MAKB, MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN) VALUES (?, ?, ?, ?, ?, null, 0)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kb.getMAKB());
        ps.setString(2, kb.getMaBN());
        ps.setString(3, kb.getMaBS());

        LocalDate nKham = kb.getnKham();
        ps.setDate(4, Date.valueOf(nKham));

        ps.setString(5, kb.getYCKham());   
    }
    
    
    public String layMaKB(String maBN, LocalDate ngayKham) throws SQLException{
        String makb = "";
        String sql = "SELECT MAKB FROM KHAMBENH " +
                     "WHERE MaBN = ? AND NgayKham = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maBN);
        ps.setDate(2, Date.valueOf(ngayKham));

        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                makb = rs.getString("MAKB");
            }
        return makb;
    }
    
    public String getYeuCauKham(String maKB) throws SQLException {
        String sql = "SELECT YEUCAUKHAM FROM KHAMBENH " +
                     "WHERE MAKB = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);

        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("YEUCAUKHAM");
            }
        return "";
    }
    
    public List<String> layBN(String maBS, LocalDate ngayKham) throws SQLException {
        List<String> danhSachBenhNhan = new ArrayList<>();
        String sql = "SELECT bn.TENBN FROM BENHNHAN bn " +
                     "JOIN KHAMBENH kb ON kb.MABN = bn.MABN " +
                     "WHERE kb.MABS = ? AND kb.NGAYKHAM = ? AND kb.THANHTOAN = 0";
        
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "QLKB", "123");
        } catch (SQLException e) {
            e.printStackTrace();
        }        
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maBS);
        ps.setDate(2, Date.valueOf(ngayKham));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            danhSachBenhNhan.add(rs.getString("TENBN"));
        }
        return danhSachBenhNhan;
    }
    
    public String layMaBN(String maBS, LocalDate ngayKham, String tenBN) throws SQLException {
        String maBN = null;
        String sql = "SELECT bn.MABN FROM KHAMBENH kb " +
                     "JOIN BENHNHAN bn ON bn.MABN = kb.MABN " +
                     "WHERE kb.MABS = ? AND kb.NGAYKHAM = ? AND bn.TENBN = ?";

        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maBS);
        ps.setDate(2, Date.valueOf(ngayKham));
        ps.setString(3, tenBN);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            maBN = rs.getString("MABN");
        }
        return maBN;
    }
    
    public void updateKetLuan(String makb, String ketluan) throws SQLException{
        String sql = "UPDATE KHAMBENH SET KETLUAN = ? WHERE MAKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, ketluan);
        ps.setString(2, makb);
        ps.executeUpdate();
    } 
    
    public KhamBenhDTO ThongTinKhamBenh(String maKB) throws SQLException {
        String sql = "SELECT KETLUAN, YEUCAUKHAM FROM KHAMBENH WHERE MAKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String ketluan = rs.getString("KETLUAN");
            String yckham = rs.getString("YEUCAUKHAM");
            
            khamBenhDTO.setKetLuan(ketluan);
            khamBenhDTO.setYCKham(yckham);
        }
        
        return khamBenhDTO;
    }
    
    public boolean isThanhToan(String maKB) throws SQLException {
        String sql = "SELECT THANHTOAN FROM KHAMBENH WHERE MAKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);
        ResultSet rs = ps.executeQuery();
        int thanhtoan = 0;
        if (rs.next()) {
            thanhtoan = rs.getInt("THANHTOAN");
        }
        
        if (thanhtoan == 1)
            return true;
        else
            return false;
    }
    
    public void updateThanhToan(String maKB) throws SQLException{
        String sql = "UPDATE KHAMBENH SET THANHTOAN = 1 WHERE MAKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);
        ps.executeUpdate();
    }
}
