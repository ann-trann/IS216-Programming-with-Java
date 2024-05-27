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
public class BenhNhanDTO {
    private String MaBN;
    private String TenBN;
    private LocalDate nSinh;
    private String dchi;
    private String dthoai;
    private String gtinh;

    public BenhNhanDTO() {
    }

    public BenhNhanDTO(String MaBN, String TenBN, LocalDate nSinh, String dchi, String dthoai, String gtinh) {
        this.MaBN = MaBN;
        this.TenBN = TenBN;
        this.nSinh = nSinh;
        this.dchi = dchi;
        this.dthoai = dthoai;
        this.gtinh = gtinh;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getTenBN() {
        return TenBN;
    }

    public void setTenBN(String TenBN) {
        this.TenBN = TenBN;
    }

    public LocalDate getNSinh() {
        return nSinh;
    }

    public void setNSinh(LocalDate nSinh) {
        this.nSinh = nSinh;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getDthoai() {
        return dthoai;
    }

    public void setDthoai(String dthoai) {
        this.dthoai = dthoai;
    }

    public String getGtinh() {
        return gtinh;
    }

    public void setGtinh(String gtinh) {
        this.gtinh = gtinh;
    }
    
    
    
}
