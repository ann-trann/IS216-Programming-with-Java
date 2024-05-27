/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_1.controller;

import Cau_1.connection.OracleConnection;
import Cau_1.model.ModelUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author trant
 */
public class SignUp_SIgnIn_Controller {
    
    private final Connection con;

    //Connect to the DataBase       
    public SignUp_SIgnIn_Controller() {
        this.con = OracleConnection.getInstance().getConnection();
    }

    public ModelUser signIn(ModelUser signin) {
        ModelUser user = null;
        String sql = "SELECT * FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, signin.getUsername());
            ps.setString(2, signin.getPassword());
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String username = rs.getString("USERNAME");
                    String password = rs.getString("PASSWORD");
                    user = new ModelUser(username, password);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error during sign in: " + e.getMessage());
        }

        return user;
    }
    
    public ModelUser signUp(ModelUser signup) {
        ModelUser user = null;
        String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, signup.getUsername());
            
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    String insertSql = "INSERT INTO USERS (USERNAME, PASSWORD) VALUES (?, ?)";
                    try (PreparedStatement insertPs = con.prepareStatement(insertSql)) {
                        insertPs.setString(1, signup.getUsername());
                        insertPs.setString(2, signup.getPassword());
                        int rowsAffected = insertPs.executeUpdate();

                        if (rowsAffected > 0) {
                            user = signup;
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error during sign in: " + e.getMessage());
        }

        return user;
    }
    
}
