/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trant
 */
public class DichVuDAO {

    private final Connection con;

    public DichVuDAO() {
        con = OracleConnection.getInstance().getConnection();
    }
    
    public List<String> DanhSachDichVu() throws SQLException {
        List<String> dsdv = new ArrayList<>();
        String sql = "SELECT TENDV FROM DICHVU";

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(sql);

        while (rs.next()) {
            dsdv.add(rs.getString("TENDV"));
        }
        return dsdv;
    }
    
    public String layMaDV(String tenDV) throws SQLException {
        String maDV = null;
        String sql = "SELECT MADV FROM DICHVU WHERE TENDV = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tenDV);
        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maDV = rs.getString("MADV");
        }
        return maDV;
    }
    
    public int layDonGia(String tenDV) throws SQLException {
        int gonGia = 0;
        String sql = "SELECT DONGIA FROM DICHVU WHERE TENDV = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tenDV);
        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                gonGia = rs.getInt("DONGIA");
        }
        return gonGia;
    }    
}
