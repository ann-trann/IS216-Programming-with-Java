/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai09;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class KhachHangSanXuat extends KhachHang {

    protected int loaiDien;

    public KhachHangSanXuat(int loaiDien, String maKh, String tenKh, Date ngayHD, double soLuongDien, double donGia, double thanhTien) {
        super(maKh, tenKh, ngayHD, soLuongDien, donGia, thanhTien);
        this.loaiDien = loaiDien;
    }

    public KhachHangSanXuat() {
    }

    @Override
    void nhapThongTin() {
        System.out.println("--------Khach Hang San Xuat---------");
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("Nhap loai dien: ");
        loaiDien = sc.nextInt();
    }

    @Override
    void tinhThanhTien() {
        if (loaiDien == 2) {
            thanhTien = soLuongDien * donGia;
            if (soLuongDien > 200) {
                thanhTien *= 0.98;
            }
        } else {
            thanhTien = soLuongDien * donGia;
            if (soLuongDien > 150) {
                thanhTien *= 0.97;
            }
        }
    }

    @Override
    void xuatThongTin() {
        System.out.println("--------Khach Hang San Xuat---------");
        super.xuatThongTin();
        System.out.println("Loai dien: " + loaiDien);
    }
    
    int getLoaiDieṇ(){
        return loaiDien;
    }
    
    @Override
    void setLoaiDien(int loaiDien){
        this.loaiDien = loaiDien;
    }
    
    @Override
    int getLoai(){
        return 3;
    }
}
