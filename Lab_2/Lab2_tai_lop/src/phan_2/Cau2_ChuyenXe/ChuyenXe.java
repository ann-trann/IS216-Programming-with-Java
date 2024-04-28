/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau2_ChuyenXe;


/**
 *
 * @author trant
 */

import java.util.Scanner;

public class ChuyenXe {
    protected String MaSoChuyen;
    protected String tenTaiXe;
    protected String soXe;
    protected float klgHangHoa;
    protected float doanhThu;

    public ChuyenXe() {}

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }
    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }
    public String getTenTaiXe() {
        return tenTaiXe;
    }
    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }
    public String getSoXe() {
        return soXe;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public float getKlgHangHoa() {
        return klgHangHoa;
    }
    public void setKlgHangHoa(float klgHangHoa) {
        this.klgHangHoa = klgHangHoa;
    }
    public float getDoanhThu() {
        return doanhThu;
    }
    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }  
    
    
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so chuyen: ");
        MaSoChuyen = sc.nextLine();
        System.out.print("Nhap ten tai xe: ");
        tenTaiXe = sc.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = sc.nextLine();
        System.out.print("Nhap khoi luong hang hoa: ");
        klgHangHoa = sc.nextFloat();
        System.out.print("Nhap doanh thu: ");
        doanhThu = sc.nextFloat();
    }

    public void Xuat(){
        System.out.print("Ma so chuyen: " + MaSoChuyen+"\tTai xe: " + tenTaiXe+"\t\tSo xe: " + soXe
                        +"\tKhoi luong hang hoa: " + klgHangHoa+"\tDoanh thu: " + doanhThu);
    }
    
    
}
