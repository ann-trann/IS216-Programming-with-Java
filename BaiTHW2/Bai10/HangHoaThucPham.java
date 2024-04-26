/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai10;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class HangHoaThucPham extends HangHoa {

    private Date ngaySx, ngayHetHan;
    private String nhaCungCap;

    HangHoaThucPham() {
        ngaySx = new Date();
        ngayHetHan = new Date();
    }

    public HangHoaThucPham(Date ngaySx, Date ngayHetHan, String nhaCungCap, String maHang, String tenHang, double donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.ngaySx = ngaySx;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public void nhapThongTin() {
        System.out.println("------------Hang Hoa Thuc Pham--------------");
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ngay san xuat");
        ngaySx.nhap();
        do {
            System.out.println("Nhap ngay  het han:");
            System.out.println("Luu y: ngay cung cap khong duoc nho hon ngay het han");
            ngayHetHan.nhap();
        } while (ngaySx.soSanh(ngayHetHan));
        System.out.print("Nhap nha cung cap: ");
        nhaCungCap = sc.nextLine();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("------------Hang Hoa Thuc Pham--------------");
        System.out.print("Ngay san xuat: " + ngaySx.toString() + "\t");
        System.out.print("Ngay het han: " + ngayHetHan.toString() + "\t");
        System.out.println("Nha cung cap: " + nhaCungCap);
    }

    @Override
    String danhGiaMucDoBanBuon() {
        if (soLuongTon > 2) {
            return "kho ban";
        }
        return "khong danh gia";
    }

    @Override
    double thanhTien() {
        return soLuongTon * donGia * 1.05;
    }

}
