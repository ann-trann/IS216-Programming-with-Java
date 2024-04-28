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

public abstract class KhachHang {
    protected String maKH, tenKH;
    protected Date ngayHD;
    protected double soLuongDien, donGia, thanhTien;

    public KhachHang() {
        ngayHD = new Date();
    }

    public KhachHang(String maKH, String tenKH, Date ngayHD, double soLuongDien, double donGia, double thanhTien) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.ngayHD = ngayHD;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaKH() {
        return maKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public String getNgayHD() {
        return ngayHD.toString();
    }
    public int getThang(){
        return ngayHD.getMm();
    }
    public int getNam(){
        return ngayHD.getYyyy();
    }
    
    public int getLoaiDien(){
        return 0;
    }
    
        
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        ngayHD.Nhapngay();
        System.out.println("Nhap so luong dien: ");
        soLuongDien = sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextInt();
    }
    
    public void XuatHD(){
        System.out.println(maKH+"\t"+tenKH+"\tSo luong dien: "+soLuongDien+"\tThanh tien: "+thanhTien);
    }
    
    public abstract int getLoai();
        
    public abstract void tinhThanhTien();

    void setLoaiDien(int loaiDien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
