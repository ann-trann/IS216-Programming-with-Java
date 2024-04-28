/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1_CtyDienLuc;

/**
 *
 * @author trant
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class KhachHangList {
    private List<KhachHang> kh = new ArrayList<KhachHang>();
    
    private int loaiDien;
    
    boolean checkDieuKienNhap(String maKH, String tenKH, String ngayHD){
        for (int i = 0; i < kh.size(); i++){
            if (kh.get(i).getMaKH().equals(maKH)){
                if (!kh.get(i).getTenKH().equals(tenKH)){
                    System.out.println(kh.get(i).getTenKH() + " " + tenKH);
                    return false;
                }
                else {
                    if (kh.get(i).getNgayHD().equals(ngayHD)){
                        return false;
                    }
                }   
            }
        }
        return true;
    }
    
    boolean daCoTrongList(String makh, String tenkh) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).getMaKH().equals(makh) && kh.get(i).getLoai() == 3) {
                if (kh.get(i).getTenKH().equals(tenkh)) {
                    this.loaiDien = kh.get(i).getLoaiDien();
                    return true;
                }
            }
        }
        return false;
    }
    
    
    void nhapThongTin(){
        int luaChon;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Khach Hang Sinh Hoat\n2, Khach Hang Kinh Donah\n3. Khach Hang SanXuat");
            luaChon = sc.nextInt();
            
            KhachHang info_kh;
            switch (luaChon){
                case 1:
                    info_kh = new SinhHoat();
                    info_kh.Nhap();
                    break;
                case 2:
                    info_kh = new KinhDoanh();
                    info_kh.Nhap();
                    break;
                default:
                    info_kh = new SanXuat();
                    info_kh.Nhap();
                    if (daCoTrongList(info_kh.getMaKH(), info_kh.getTenKH())){
                        info_kh.setLoaiDien(this.loaiDien);
                    }
                    break;
            }
            
            if (!checkDieuKienNhap(info_kh.getMaKH(), info_kh.getTenKH(),info_kh.getNgayHD())){
                System.out.println("Loi nhap");
                continue;
            }
            if (info_kh.getMaKH().isEmpty()){
                break;
            }
            kh.add(info_kh);
        }
    }
    
    
    void Xuat(){
        int nam, thang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang can kiem tra: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam can kiem tra: ");
        nam = sc.nextInt();
        for (int i = 0; i < kh.size(); i++){
            if (kh.get(i).getThang() == thang && kh.get(i).getNam() == nam){
                kh.get(i).XuatHD();
            }
        }
    }
    
}
