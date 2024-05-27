/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2_HuongDanChung;

/**
 *
 * @author trant
 */
public class SanPhamDTO {
    private String MaSP;
    private String TenSP;
    private int gia;

    public SanPhamDTO() {
    }

    public SanPhamDTO(String MaSP, String TenSP, int gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.gia = gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
}
