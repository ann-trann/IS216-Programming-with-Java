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
import java.sql.DriverManager;

/**
 *
 * @author trant
 */
public class BacSiDAO {
    private Connection con;
    
    public BacSiDAO() {
        this.con = OracleConnection.getInstance().getConnection();
    }
    
    public List<String> DSTenBS() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "QLKB", "123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        List<String> danhSachTenBS = new ArrayList<>();
        
        String sql = "SELECT TENBS FROM BACSI";

        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            danhSachTenBS.add(rs.getString("TENBS"));
        }
        return danhSachTenBS;
    }
    
    public String layMaBS(String tenBS) throws SQLException {
        String maBS = null;
        String sql = "SELECT MABS FROM BACSI WHERE TENBS = ?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tenBS);
        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                maBS = rs.getString("MABS");
        }
        return maBS;
    }
    
}
