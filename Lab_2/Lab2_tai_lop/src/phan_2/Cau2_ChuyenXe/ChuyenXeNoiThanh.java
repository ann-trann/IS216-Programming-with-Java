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

public class ChuyenXeNoiThanh extends ChuyenXe{
    private float quangDuong;

    public ChuyenXeNoiThanh() {
    }

    
    public float getQuangDuong() {
        return quangDuong;
    }
    public void setQuangDuong(float quangDuong) {
        this.quangDuong = quangDuong;
    }
    
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap quang duong: ");
        quangDuong = sc.nextFloat();
    }
    
    public void Xuat(){
        super.Xuat();
        System.out.println("\tQuang duong: " + quangDuong);
    }

    public void nhapDanhSachXe(ChuyenXeNoiThanh[] ds, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhap thong tin chuyen xe noi thanh thu " + (i+1) + ": ");
            ds[i] = new ChuyenXeNoiThanh();
            ds[i].Nhap();
        }
    }

    public void xuatDanhSachXe(ChuyenXeNoiThanh[] ds, int n){
        System.out.println("\n=========== Danh sach chuyen xe noi thanh =========== ");
        for (int i = 0; i < n; i++) {
            System.out.println("----- Chuyen xe noi thanh thu " + (i+1) + ": ");
            ds[i].Xuat();
        }
    }

    public float tongDoanhThu(ChuyenXeNoiThanh[] ds, int n){
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ds[i].getDoanhThu();
        }
        return sum;
    }

    public void xuatChuyenXeNoiThanhCoDoanhThuCaoNhat(ChuyenXeNoiThanh[] ds, int n){
        float max = ds[0].getDoanhThu();
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (ds[i].getDoanhThu() > max){
                max = ds[i].getDoanhThu();
                index = i;
            }
        }
        System.out.println("----- Chuyen xe noi thanh co doanh thu cao nhat: ");
        ds[index].Xuat();
    }

    
}
