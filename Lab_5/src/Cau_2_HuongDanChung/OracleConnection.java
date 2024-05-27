/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2_HuongDanChung;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


/**
 *
 * @author trant
 */

public class OracleConnection {
    private static OracleConnection instance;
    private Connection connection;

    OracleConnection() {
        try {
            connectToDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static OracleConnection getInstance() {
        if (instance == null) {
            instance = new OracleConnection();
        }
        return instance;
    }

    private void connectToDatabase() throws SQLException {
        final String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        final String username = "QLSP";
        final String password = "123";
        connection = DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection() {
        return connection;
    }
}
