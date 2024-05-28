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
    private int soLuong;
    private int ThanhTien;

    public ThuPhiDTO() {
    }

    public ThuPhiDTO(String MaKB, String MaDV, int soLuong, int ThanhTien) {
        this.MaKB = MaKB;
        this.MaDV = MaDV;
        this.soLuong = soLuong;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
