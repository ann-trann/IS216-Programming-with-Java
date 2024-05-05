/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_4.model;

import java.io.Serializable;

/**
 *
 * @author trant
 */

public class Sach implements Serializable  {
    int MaSach;
    String TenSach,TacGia,NXB;
    int Gia;

    public Sach() {
    }

    public Sach(int MaSach, String TenSach, String TacGia, String NXB, int Gia) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.NXB = NXB;
        this.Gia = Gia;
    }

    public int getMaSach() {
        return MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public int getGia() {
        return Gia;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "MaSach=" + MaSach + ", TenSach=" + TenSach + ", TacGia=" + TacGia + ", NXB=" + NXB + ", Gia=" + Gia + '}';
    }
    
    
}