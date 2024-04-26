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

public class HangHoaDienMay extends HangHoa {

    private String thuongHieu, loaiMay;
    private int thoiGianBaoHanh;

    HangHoaDienMay() {
    }

    public HangHoaDienMay(String thuongHieu, String loaiMay, int thoiGianBaoHanh, String maHang, String tenHang, double donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.thuongHieu = thuongHieu;
        this.loaiMay = loaiMay;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Hang Hoa Dien May-----------");
        super.nhapThongTin();
        System.out.print("Nhap thuong hieu: ");
        thuongHieu = sc.nextLine();
        System.out.print("Nhap loai may: ");
        loaiMay = sc.nextLine();
        System.out.println("Nhap thoi gian bao hanh(theo thang): ");
        thoiGianBaoHanh = sc.nextInt();
    }

    @Override
    public void xuatThuongHieu() {
        System.out.println(thuongHieu + "\t" + loaiMay + "\t" + tenHang);
    }

    @Override
    String danhGiaMucDoBanBuon() {
        if (soLuongTon < 3) {
            return "ban Duoc";
        }
        return "khong the danh gia";
    }

    @Override
    double thanhTien() {
        return soLuongTon * donGia * 1.1;
    }

}
