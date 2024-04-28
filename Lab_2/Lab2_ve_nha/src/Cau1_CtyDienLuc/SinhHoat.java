/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1_CtyDienLuc;

/**
 *
 * @author trant
 */
public class SinhHoat extends KhachHang{
    private float dinhMuc;
    
    public SinhHoat(){
        
    }
    
    public SinhHoat(float dinhMuc, String maKH, String tenKH, Date ngayHD, float soLuongDien, float donGia, float thanhTien){
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
        this.dinhMuc = dinhMuc;
    }
    
    public void tinhThanhTien(){
        if (soLuongDien <= dinhMuc){
            thanhTien = soLuongDien * donGia;
        }
        else {
            thanhTien = soLuongDien * donGia * dinhMuc + (soLuongDien - dinhMuc) * donGia * 2;
        }
    }

    @Override
    public int getLoai() {
        return 1;
    }
    
    public void Nhap(){
        System.out.println("----- Khach Hang Sinh Hoat -----");
        super.Nhap();
    }
    
}
