/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DAO;

import Cau_2.DTO.BenhNhanDTO;
import Cau_2.connection.OracleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author trant
 */
public class BenhNhanDAO {
    
    private final Connection con;

    public BenhNhanDAO() {
        this.con = OracleConnection.getInstance().getConnection();
    }
    
    public void addBenhNhan(BenhNhanDTO bn) throws SQLException {
        String selectSql = "SELECT MABN FROM BENHNHAN WHERE MABN = ?";
        PreparedStatement selectStatement = con.prepareStatement(selectSql);
        selectStatement.setString(1, bn.getMaBN());
        
        ResultSet resultSet = selectStatement.executeQuery();
        
        if (!resultSet.next()) {
            insertBenhNhan(bn);
        }
    }
    
    public void insertBenhNhan(BenhNhanDTO bn) throws SQLException {
        String sql = "INSERT INTO BENHNHAN(MaBN, TenBN, NgSinh, Dchi, Dthoai, GioiTinh) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, bn.getMaBN());
        ps.setString(2, bn.getTenBN());
        
        LocalDate nSinh = bn.getNSinh();
        ps.setDate(3, Date.valueOf(nSinh));
        ps.setString(4, bn.getDchi());
        ps.setString(5, bn.getDthoai());
        ps.setString(6, bn.getGtinh());
        
        ps.execute();
    }
    
    public String layTenBN(String mabn) throws SQLException {
        String tenbn = null;
        
        String sql = "SELECT TENBN FROM BENHNHAN WHERE MABN = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, mabn);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            tenbn = rs.getString("TenBN");
        }
        return tenbn;
    }
}
