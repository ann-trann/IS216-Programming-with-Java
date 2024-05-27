/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.BUS;

import Cau_2.DAO.BenhNhanDAO;
import Cau_2.DTO.BenhNhanDTO;
import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author trant
 */
public class BenhNhanBUS {
     private BenhNhanDAO benhNhanDAO;

    public BenhNhanBUS() {
        benhNhanDAO = new BenhNhanDAO();
    }

    public boolean addBenhNhan(BenhNhanDTO bn) throws SQLException {
        
        Connection con = OracleConnection.getInstance().getConnection();
        
        String selectSql = "SELECT MABN FROM BENHNHAN WHERE MABN = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectSql);
        selectStatement.setString(1, bn.getMaBN());
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (resultSet.next()) {
            return false;
        } else {
            benhNhanDAO.insertBenhNhan(bn);
            return true;
        }
    }
    
    public String layTenBN(String mabn) throws SQLException{
        return benhNhanDAO.layTenBN(mabn);
    }
}
