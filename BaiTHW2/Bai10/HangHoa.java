/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai10;

import java.util.Scanner;

/**
 *
 * @author 7713b
 */
public abstract class HangHoa {
    protected String maHang, tenHang;
    protected double donGia;
    protected int soLuongTon;
    
    HangHoa(){
    }

    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }
    
    void xuatThongTin(){
        System.out.print("Ma hang: " + maHang + "\t");
        System.out.print("Ten hang: " + tenHang + "\t");
        System.out.print("Don gia: " + donGia + "\t");
        System.out.print("So luong ton: " + soLuongTon + "\t");
    }
    
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong ton: ");
        soLuongTon = sc.nextInt();
    }
    
    abstract String danhGiaMucDoBanBuon();
    
    abstract double thanhTien();
    
    void xuatMucDoDanhGia(){
        System.out.println(maHang + "\t" + tenHang + "\t" + soLuongTon + "\t" + danhGiaMucDoBanBuon());
    }
    
    void xuatThuongHieu(){
        System.out.println();
    }
    
    String getMaHH(){
        return maHang;
    }
}
