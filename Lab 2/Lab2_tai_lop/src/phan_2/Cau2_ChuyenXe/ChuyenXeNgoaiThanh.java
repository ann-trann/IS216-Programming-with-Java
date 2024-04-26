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

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private float soNgayVanChuyen;

    public ChuyenXeNgoaiThanh() {
    }

    public String getNoiDen() {
        return noiDen;
    }
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public float getSoNgayVanChuyen() {
        return soNgayVanChuyen;
    }
    public void setSoNgayVanChuyen(float soNgayVanChuyen) {
        this.soNgayVanChuyen = soNgayVanChuyen;
    }
    
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap noi den: ");
        noiDen = sc.nextLine();
        System.out.print("Nhap so ngay van chuyen: ");
        soNgayVanChuyen = sc.nextFloat();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println("\tNoi den: " + noiDen+"\t\tSo ngay van chuyen: " + soNgayVanChuyen);
    }

    public void nhapDanhSachXe(ChuyenXeNgoaiThanh[] ds, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhap thong tin chuyen xe ngoai thanh thu " + (i+1) + ": ");
            ds[i] = new ChuyenXeNgoaiThanh();
            ds[i].Nhap();
        }
    }

    public void xuatDanhSachXe(ChuyenXeNgoaiThanh[] ds, int n){
        System.out.println("\n=========== Danh sach chuyen xe ngoai thanh =========== ");
        for (int i = 0; i < n; i++) {
            System.out.println("----- Chuyen xe ngoai thanh thu " + (i+1) + ": ");
            ds[i].Xuat();
        }
    }

    public float tongDoanhThu(ChuyenXeNgoaiThanh[] ds, int n){
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ds[i].getDoanhThu();
        }
        return sum;
    }

    public void xuatChuyenXeNgoaiThanhCoDoanhThuCaoNhat(ChuyenXeNgoaiThanh[] ds, int n){
        float max = ds[0].getDoanhThu();
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (ds[i].getDoanhThu() > max){
                max = ds[i].getDoanhThu();
                index = i;
            }
        }
        System.out.println("----- Chuyen xe ngoai thanh co doanh thu cao nhat la: ");
        ds[index].Xuat();
    }
}
