/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.connection.OracleConnection;
import java.sql.Connection;
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
    public List<String> DanhSachDichVu() throws SQLException {
        List<String> dsdv = new ArrayList<>();
        String sql = "SELECT TENDV FROM DICHVU";

        try (
            Connection con = OracleConnection.getInstance().getConnection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql)) {

            while (rs.next()) {
                dsdv.add(rs.getString("TENDV"));
            }
        }

        return dsdv;
    }
}
