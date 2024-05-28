/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DTO;

/**
 *
 * @author trant
 */
public class ThuPhiDTO {
    private String MaKB;
    private String MaDV;
    private String TenDV;
    private int SoLuong;
    private int ThanhTien;

    public ThuPhiDTO() {
    }

    public ThuPhiDTO(String MaKB, String MaDV, int SoLuong, int ThanhTien) {
        this.MaKB = MaKB;
        this.MaDV = MaDV;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public ThuPhiDTO(String TenDV, int SoLuong, int ThanhTien) {
        this.TenDV = TenDV;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public String getMaKB() {
        return MaKB;
    }

    public void setMaKB(String MaKB) {
        this.MaKB = MaKB;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    

    
}
