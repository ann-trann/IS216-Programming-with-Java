/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1_CtyDienLuc;

/**
 *
 * @author trant
 */
public class KinhDoanh  extends KhachHang{

    public KinhDoanh() {
    }

    public KinhDoanh(String maKH, String tenKH, Date ngayHD, float soLuongDien, float donGia, float thanhTien) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
    }
    
    
    
    public void tinhThanhTien(){
        if (soLuongDien > 400){
            thanhTien = soLuongDien * donGia * 0.05f;
        }
        else {
            thanhTien = soLuongDien * donGia;
        }
    }

    @Override
    public int getLoai() {
        return 2;
    }
    
    public void Nhap(){
        System.out.println("----- Khach Hang Kinh Doanh -----");
        super.Nhap();
    }
    
}
