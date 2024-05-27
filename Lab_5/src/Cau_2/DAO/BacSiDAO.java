/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.connection.OracleConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author trant
 */
public class BacSiDAO {
    
    public List<String> DSTenBS() throws SQLException {
        List<String> danhSachTenBS = new ArrayList<>();
        
        try (
            Connection con = OracleConnection.getInstance().getConnection()) {
            String sql = "SELECT TENBS FROM BACSI";
            try (
                PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    danhSachTenBS.add(rs.getString("TENBS"));
                }
            }
        }
        return danhSachTenBS;
    }
    
    public String layMaBS(String tenBS) throws SQLException {
        String maBS = null;
        String sql = "SELECT MABS FROM BACSI WHERE TENBS = ?";
        
        try (
            Connection con = OracleConnection.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, tenBS);
            try (
                ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    maBS = rs.getString("MABS");
                }
            }
        }
        return maBS;
    }
}
