/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau_2;

/**
 *
 * @author trant
 */

import java.util.*;

public class DanhBa {

    private Map<String, Set<String>> danhBa;
    
    public DanhBa() {
        danhBa = new HashMap<>();
    }
    
    public void themSDT(String diaChi, String sDT){
        if (!danhBa.containsKey(diaChi)) {
            danhBa.put(diaChi, new HashSet<>());
        }
        Set<String> dsSDT = danhBa.get(diaChi);
        dsSDT.add(sDT);
    }
    
    public void traCuuTheoSDT(String sDT) {
        boolean found = false;
        for (Map.Entry<String, Set<String>> entry : danhBa.entrySet()) {
            if (entry.getValue().contains(sDT)) {
                System.out.println("So dien thoai: " + sDT + ",\t Dia chi dang ky: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay so dien thoai trong danh ba");
        }
    }
    
    public void traCuuTheoDiaChi(String diaChi) {
        Set<String> SDT = danhBa.get(diaChi);
        if (SDT != null) {
            System.out.println("Dia chi dang ky: " + diaChi);
            System.out.println("Danh sach so dien thoai: ");
            for (String sdt : SDT) {
                System.out.println("    - " + sdt);
            }
        }
        else {
            System.out.println("Khong tim thay dia chi trong danh ba.");
        }
    }
    
    
    public static void main(String[] args) {
        DanhBa danhBa = new DanhBa();
        
        danhBa.themSDT("123 Ngo Quyen", "0987123456");
        danhBa.themSDT("123 Ngo Quyen", "0918723654");
        danhBa.themSDT("492 Vo Thi Sau", "0123498765");
        
        System.out.println("-- Tra cuu theo so dien thoai --");
        danhBa.traCuuTheoSDT("0987123456");
        danhBa.traCuuTheoSDT("0123498765");
        danhBa.traCuuTheoSDT("9999999999");

        System.out.println("-- Tra cuu theo dia chi --");
        danhBa.traCuuTheoDiaChi("123 Ngo Quyen");
        danhBa.traCuuTheoDiaChi("789 Nguyen Trai");
    }
    
}
