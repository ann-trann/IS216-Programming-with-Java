/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.BUS;

import Cau_2.DAO.KhamBenhDAO;
import Cau_2.DTO.KhamBenhDTO;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author trant
 */
public class KhamBenhBUS {
    private KhamBenhDAO khamBenhDAO;

    public KhamBenhBUS() {
        khamBenhDAO = new KhamBenhDAO();
    }

    public boolean addKhamBenh(KhamBenhDTO kb) throws SQLException {
        khamBenhDAO.insertKhamBenh(kb);
        return true;
    }
    
    public String layMaKB() throws SQLException{
        String maxMaKB = khamBenhDAO.layMaxMaKB();
        if (maxMaKB == null || maxMaKB.isEmpty()) {
            return "000001";
        } 
        else {
            int maxMa = Integer.parseInt(maxMaKB);
            int newMaKB = maxMa + 1;
            return String.format("%06d", newMaKB);
        }
    }
    
    public String layYeuCauKham(String maBN, String maBS, LocalDate ngayKham) throws SQLException {
        return khamBenhDAO.getYeuCauKham(maBN, maBS, ngayKham);
    }
    
    public List<String> layBN(String maBS, Date ngayKham) throws SQLException {
        return khamBenhDAO.layBN(maBS, ngayKham);
    }
    
    public String layMaBN(String maBS, Date ngayKham, String tenBN) throws SQLException {
        return khamBenhDAO.layMaBN(maBS, ngayKham, tenBN);
    }
    
}
