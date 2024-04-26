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

public class KhachHangSinhHoat extends KhachHang {

    private int dinhMuc;

    public KhachHangSinhHoat(int dinhMuc, String maKh, String tenKh, Date ngayHD, double soLuongDien, double donGia, double thanhTien) {
        super(maKh, tenKh, ngayHD, soLuongDien, donGia, thanhTien);
        this.dinhMuc = dinhMuc;
    }

    public KhachHangSinhHoat() {
        super();
    }

    @Override
    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Khach Hang Sinh Hoat---------");
        super.nhapThongTin();
        System.out.print("Nhap dinh muc: ");
        dinhMuc = sc.nextInt();
    }

    @Override
    void tinhThanhTien() {
        if (soLuongDien <= dinhMuc) {
            thanhTien = soLuongDien * donGia;
        } else {
            thanhTien = soLuongDien * donGia * dinhMuc + (soLuongDien - dinhMuc) * 2 * donGia;
        }
    }

    @Override
    void xuatThongTin() {
        System.out.println("--------Khach Hang Sinh Hoat---------");
        super.xuatThongTin();
        System.out.println("Dinh muc: " + dinhMuc + "\t");
    }

    @Override
    int getLoai() {
        return 1;
    }

}
