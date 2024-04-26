/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai09;

import java.util.Scanner;

/**
 *
 * @author 7713b
 */
public abstract class KhachHang {

    protected String maKh, tenKh;
    protected double soLuongDien, donGia, thanhTien;
    protected Date ngayHD;

    public KhachHang(String maKh, String tenKh, Date ngayHD, double soLuongDien, double donGia, double thanhTien) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.ngayHD = ngayHD;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public KhachHang() {
        ngayHD = new Date();
    }

    void nhapThongTin() {
        System.out.print("Nhap ngay hoa don: ");
        ngayHD.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        maKh = sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        tenKh = sc.nextLine();
        System.out.print("Nhap so luong dien: ");
        soLuongDien = sc.nextDouble();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }

    void xuatThongTin() {
        System.out.print("Ma khach hang: " + maKh + "\t");
        System.out.print("Ten khach hang: " + tenKh + "\t");
        System.out.print("Ngay hoa don: " + ngayHD.toString() + "\t");
        System.out.print("So luong dien: " + soLuongDien + "\t");
        System.out.print("Don gia: " + donGia + "\t");
        System.out.print("Thanh tien: " + thanhTien + "\t");
    }

    abstract void tinhThanhTien();

    public String getMaKh() {
        return maKh;
    }

    public String getTenKh() {
        return tenKh;
    }
    
    abstract int getLoai();
    
    int getLoaiDien(){
        return 0;
    }
    void setLoaiDien(int loaiDien){
    }
    
    void xuatHoaDon(){
        tinhThanhTien();
        System.out.print("Ma khach hang: " + maKh + "\t");
        System.out.print("Ten khach hang: " + tenKh + "\t");
        System.out.print("Ngay hoa don: " + ngayHD.toString() + "\t");
        System.out.print("So luong dien: " + soLuongDien + "\t");
        System.out.print("Thanh tien: " + thanhTien + "\t");
    }
    
    String getNgayHD(){
        return ngayHD.toString();
    }
    
    int getThang(){
        return ngayHD.getMm();
    }
    
    int getNam(){
        return ngayHD.getYyyy();
    }
}
