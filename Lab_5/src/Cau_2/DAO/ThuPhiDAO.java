/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.DTO.ThuPhiDTO;
import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trant
 */
public class ThuPhiDAO {
    
    private final Connection con;

    public ThuPhiDAO() {
        this.con = OracleConnection.getInstance().getConnection();
    }
    
    public void insertThuPhi(ThuPhiDTO tp) throws SQLException {
        String sql = "INSERT INTO THUPHI(MaDV, SoLuong, ThanhTien) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tp.getMaKB());
        ps.setString(2, tp.getMaDV());
        ps.setInt(3, tp.getSoLuong());
        ps.setInt(4, tp.getThanhTien());
        ps.execute();
    }

    public void xoa(String makb) throws SQLException {
        String sql = "DELETE FROM THUPHI WHERE MaKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, makb);
        ps.execute();
    }
    
    public int layTongTien(String maKB) throws SQLException {
        int tongTien = 0;
        String sql = "SELECT SUM(THANHTIEN) AS TONGTIEN FROM THUPHI WHERE MAKB = ? GROUP BY MAKB";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            tongTien = rs.getInt("TONGTIEN");
        }
        
        return tongTien;
    }
    
    public List<ThuPhiDTO> layDichVu(String maKB) throws SQLException {
        List<ThuPhiDTO> dsThuPhi = new ArrayList<>();
        String sql = "SELECT TENDV, SOLUONG, THANHTIEN FROM THUPHI tp "
                + "JOIN DICHVU dv ON dv.MADV = tp.MADV WHERE MAKB = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maKB);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            ThuPhiDTO dichVu = new ThuPhiDTO(rs.getString(1), rs.getInt(2), rs.getInt(3));
            dsThuPhi.add(dichVu);
        }
        return dsThuPhi;
    }
}
