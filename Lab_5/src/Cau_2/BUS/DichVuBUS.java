/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.BUS;

import Cau_2.DAO.DichVuDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author trant
 */
public class DichVuBUS {
    private final DichVuDAO dichVuDAO;

    public DichVuBUS() {
        dichVuDAO = new DichVuDAO();
    }

    public List<String> layDSDV() throws SQLException {
        return dichVuDAO.DanhSachDichVu();
    }
    
    public String layMaDV(String tenDV) throws SQLException {
        return dichVuDAO.layMaDV(tenDV);
    }
    
    public int layDonGia(String tenDV) throws SQLException {
        return dichVuDAO.layDonGia(tenDV);
    }
}
