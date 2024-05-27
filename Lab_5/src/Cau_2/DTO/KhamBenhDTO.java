/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_2.DTO;

import java.time.LocalDate;

/**
 *
 * @author trant
 */
public class KhamBenhDTO {
    private String MAKB;
    private String MaBN;
    private String MaBS;
    private LocalDate nKham;
    private String YCKham;
    private String KetLuan;
    private int ThanhToan;

    public KhamBenhDTO() {
    }

    public KhamBenhDTO(String MAKB, String MaBN, String MaBS, LocalDate nKham, String YCKham, String KetLuan, int ThanhToan) {
        this.MAKB = MAKB;
        this.MaBN = MaBN;
        this.MaBS = MaBS;
        this.nKham = nKham;
        this.YCKham = YCKham;
        this.KetLuan = KetLuan;
        this.ThanhToan = ThanhToan;
    }

    public String getMAKB() {
        return MAKB;
    }

    public void setMAKB(String MAKB) {
        this.MAKB = MAKB;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getMaBS() {
        return MaBS;
    }

    public void setMaBS(String MaBS) {
        this.MaBS = MaBS;
    }

    public LocalDate getnKham() {
        return nKham;
    }

    public void setnKham(LocalDate nKham) {
        this.nKham = nKham;
    }

    public String getYCKham() {
        return YCKham;
    }

    public void setYCKham(String YCKham) {
        this.YCKham = YCKham;
    }

    public String getKetLuan() {
        return KetLuan;
    }

    public void setKetLuan(String KetLuan) {
        this.KetLuan = KetLuan;
    }

    public int getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(int ThanhToan) {
        this.ThanhToan = ThanhToan;
    }

    
}
