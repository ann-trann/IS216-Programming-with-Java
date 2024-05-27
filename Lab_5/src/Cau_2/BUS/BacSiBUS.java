/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.BUS;

import Cau_2.DAO.BacSiDAO;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author trant
 */
public class BacSiBUS {
    
    private BacSiDAO bacSiDAO;

    public BacSiBUS() {
        bacSiDAO = new BacSiDAO();
    }

    public List<String> layDSTenBS() throws SQLException {
        return bacSiDAO.DSTenBS();
    }
    
    public String layMaBS(String tenBS) throws SQLException {
        return bacSiDAO.layMaBS(tenBS);
    }
}
