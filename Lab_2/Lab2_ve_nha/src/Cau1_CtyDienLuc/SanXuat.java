/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1_CtyDienLuc;

/**
 *
 * @author trant
 */
public class SanXuat  extends KhachHang{
    private int loaiDien;

    public SanXuat() {
        
    }

    public SanXuat(int loaiDien, String maKH, String tenKH, Date ngayHD, float soLuongDien, float donGia, float thanhTien) {
        super(maKH, tenKH, ngayHD, soLuongDien, donGia, thanhTien);
        this.loaiDien = loaiDien;
    }

    public int getLoaiDien() {
        return loaiDien;
    }
    
    
    public void tinhThanhTien(){
        if (loaiDien == 2){
            thanhTien = soLuongDien * donGia;
            if (soLuongDien > 200) {
                thanhTien -= thanhTien * 0.02f; 
            }
            
        }
        if(loaiDien == 3){
            thanhTien = soLuongDien * donGia;
            if (soLuongDien > 150) {
                thanhTien -= thanhTien * 0.03f; 
            }
            
        } 
    }

    @Override
    public int getLoai() {
        return 3;
    }    
    
    public void Nhap(){
        System.out.println("----- Khach Hang San Xuat -----");
        super.Nhap();
    }
    
}
