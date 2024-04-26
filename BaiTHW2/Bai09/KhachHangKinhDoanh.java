/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai09;

/**
 *
 * @author 7713b
 */
public class KhachHangKinhDoanh extends KhachHang {

    @Override
    void nhapThongTin() {
        System.out.println("--------Khach Hang Kinh Doanh---------");
        super.nhapThongTin();
    }

    @Override
    void tinhThanhTien() {
        thanhTien = soLuongDien * donGia;
        if (soLuongDien > 400) {
            thanhTien = thanhTien * 0.05;
        }
    }

    public KhachHangKinhDoanh(String maKh, String tenKh, Date ngayHD, double soLuongDien, double donGia, double thanhTien) {
        super(maKh, tenKh, ngayHD, soLuongDien, donGia, thanhTien);
    }

    public KhachHangKinhDoanh() {
    }
    
    @Override
    int getLoai(){
        return 2;
    }

}
