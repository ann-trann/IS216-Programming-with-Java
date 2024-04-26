/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai03;

/**
 *
 * @author 7713b
 */
public class SinhVien {

    private int masv;
    private String hoTen;
    private float diemLT, diemTH;
    
    public SinhVien() {
        masv = 0;
        hoTen = "";
        diemLT = diemTH = 0;
    }
    
    public SinhVien(int masv, String hoTen, float diemLT, float diemTH) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    
    public int getMasv() {
        return masv;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public float getDiemLT() {
        return diemLT;
    }
    
    public float getDiemTH() {
        return diemTH;
    }
    
    public void setMasv(int masv) {
        this.masv = masv;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    
    public float diemTB() {
        return (diemTH + diemLT) / 2;
    }
    
    @Override
    public String toString() {
        return "Masv: " + masv + ", hoTen: " + hoTen + ", diemLT: " + diemLT + ", diemTH: " + diemTH + ", diemTB: " + this.diemTB() + '\n';
    }
    
}
