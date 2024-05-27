/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.DTO.KhamBenhDTO;
import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.Date;
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
    
    public String layMaxMaKB() throws SQLException {
        String maxMaKB = "";
        try (
            Connection con = OracleConnection.getInstance().getConnection()) {
            String sql = "SELECT MAX(MaKB) AS MaxMaKB FROM KHAMBENH";
            try (
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
                if (
                    rs.next()) {
                    maxMaKB = rs.getString("MaxMaKB");
                }
            }
        }
        return maxMaKB;
    }
    
    
    
    public void insertKhamBenh(KhamBenhDTO kb) throws SQLException {
        try (
            Connection con = OracleConnection.getInstance().getConnection()) {
            String sql = "INSERT INTO KHAMBENH(MAKB, MABN, MABS, NGAYKHAM, YEUCAUKHAM, KETLUAN, THANHTOAN) VALUES (?, ?, ?, ?, ?, null, 0)";
            try (
                PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, kb.getMAKB());
                ps.setString(2, kb.getMaBN());
                ps.setString(3, kb.getMaBS());
                
                LocalDate nKham = kb.getnKham();
                ps.setDate(4, Date.valueOf(nKham));
                
                ps.setString(5, kb.getYCKham());
                
                ps.execute();
            }
        }
    }
    
    public String getYeuCauKham(String maBN, String maBS, LocalDate ngayKham) throws SQLException {
        String sql = "SELECT YEUCAUKHAM FROM KHAMBENH " +
                     "WHERE MaBN = ? AND MaBS = ? AND NgayKham = ?";

        try (
            Connection con = OracleConnection.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maBN);
            ps.setString(2, maBS);
            ps.setDate(3, Date.valueOf(ngayKham));

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("YeuCauKham");
                }
            }
        }
        return "";
    }
    
    public List<String> layBN(String maBS, Date ngayKham) throws SQLException {
        List<String> danhSachBenhNhan = new ArrayList<>();
        String sql = "SELECT bn.TENBN FROM BENHNHAN bn " +
                     "JOIN KHAMBENH kb ON kb.MABN = bn.MABN " +
                     "WHERE kb.MABS = ? AND kb.NGAYKHAM = ? AND kb.THANHTOAN = 0";

        try (
            Connection con = OracleConnection.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maBS);
            ps.setDate(2, ngayKham);
            try (
                ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    danhSachBenhNhan.add(rs.getString("TENBN"));
                }
            }
        }
        return danhSachBenhNhan;
    }
    
    public String layMaBN(String maBS, Date ngayKham, String tenBN) throws SQLException {
        String maBN = null;
        String sql = "SELECT bn.MABN FROM KHAMBENH kb " +
                     "JOIN BENHNHAN bn ON bn.MABN = kb.MABN " +
                     "WHERE kb.MABS = ? AND kb.NGAYKHAM = ? AND bn.TENBN = ?";

        try (
            Connection con = OracleConnection.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maBS);
            ps.setDate(2, ngayKham);
            ps.setString(3, tenBN);

            try (
                ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    maBN = rs.getString("MABN");
                }
            }
        }
        return maBN;
    }
    
}
