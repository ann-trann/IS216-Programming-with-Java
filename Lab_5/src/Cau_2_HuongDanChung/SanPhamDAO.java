/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2_HuongDanChung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author trant
 */
public class SanPhamDAO {
    
    public void insert(SanPhamDTO sp) throws SQLException {
        Connection con = OracleConnection.getInstance().getConnection();
        
        String sql = "INSERT INTO SANPHAM(MaSP, TenSP, Gia) VALUES (?, ?, ?)";
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, sp.getMaSP());
        p.setString(2, sp.getTenSP());
        p.setInt(3, sp.getGia());
        
        p.execute();
        p.close();
    }
    
    public void update(SanPhamDTO sp) throws SQLException {
        Connection con = OracleConnection.getInstance().getConnection();

        String sql = "UPDATE SANPHAM SET TenSP = ?, Gia = ? WHERE MaSP = ?";
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, sp.getTenSP());
        p.setInt(2, sp.getGia());
        p.setString(3, sp.getMaSP());
        
        p.execute();
        p.close();  
    }
    
    public void delete(SanPhamDTO sp) throws SQLException {
        Connection con = OracleConnection.getInstance().getConnection();
        
        String sql = "DELETE FROM SANPHAM WHERE MaSP = ?";
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, sp.getMaSP());
        
        p.execute();
        p.close();
    }
}
