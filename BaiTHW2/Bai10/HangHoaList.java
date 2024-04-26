/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 7713b
 */
public class HangHoaList {

    private List<HangHoa> hhl = new ArrayList<HangHoa>();

    public boolean checkMaHang(String mahh) {
        for (int i = 0; i < hhl.size(); i++) {
            if (mahh == hhl.get(i).getMaHH()) {
                return true;
            }
        }
        return false;
    }

    public void Nhap() {
        int luaChon;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Hang hoa dien may\n2. Hang hoa thuc pham\n3. Hang hoa gia dung");
        while (true) {
            HangHoa ins_hh = null;
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    ins_hh = new HangHoaDienMay();
                    break;
                case 2:
                    ins_hh = new HangHoaThucPham();
                    break;
                case 3:
                    ins_hh = new HangHoaGiaDung();
                    break;
            }
            ins_hh.nhapThongTin();
            if (checkMaHang(ins_hh.getMaHH())) {
                System.out.println("Ma da ton tai, nhap lai");
                continue;
            }
            if (ins_hh.getMaHH().isEmpty()) {
                break;
            }
            hhl.add(ins_hh);
        }
    }

    void xuatMucDoDanhGia() {
        for (int i = 0; i < hhl.size(); i++) {
            hhl.get(i).xuatMucDoDanhGia();
        }
    }

    void xuatThuongHieu() {
        for (int i = 0; i < hhl.size(); i++) {
            hhl.get(i).xuatThuongHieu();
        }
    }
}
