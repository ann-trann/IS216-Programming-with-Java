/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.BUS;

import Cau_2.DAO.ThuPhiDAO;
import Cau_2.DTO.ThuPhiDTO;
import java.sql.SQLException;

/**
 *
 * @author trant
 */
public class ThuPhiBUS {
    
    ThuPhiDAO thuPhiDAO;

    public ThuPhiBUS() {
        this.thuPhiDAO = new ThuPhiDAO();
    }
    
    public boolean addThuPhi(ThuPhiDTO tp) throws SQLException{
        thuPhiDAO.insertThuPhi(tp);
        return true;
    }

    public void xoa(String makb) throws SQLException {
        thuPhiDAO.xoa(makb);
    }
    
    public int layTongTien(String makb) throws SQLException {
        return thuPhiDAO.layTongTien(makb);
    }
}
