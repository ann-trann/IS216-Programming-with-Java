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

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong chuyen xe noi thanh: ");
        int n1 = sc.nextInt();
        System.out.print("Nhap so luong chuyen xe ngoai thanh: ");
        int n2 = sc.nextInt();

        ChuyenXeNoiThanh[] dsNoiThanh = new ChuyenXeNoiThanh[n1];
        ChuyenXeNgoaiThanh[] dsNgoaiThanh = new ChuyenXeNgoaiThanh[n2];
        
        ChuyenXeNoiThanh noiThanh = new ChuyenXeNoiThanh();
        ChuyenXeNgoaiThanh ngoaiThanh = new ChuyenXeNgoaiThanh();
        
        noiThanh.nhapDanhSachXe(dsNoiThanh, n1);
        ngoaiThanh.nhapDanhSachXe(dsNgoaiThanh, n1);
        
        noiThanh.xuatDanhSachXe(dsNoiThanh, n2);
        ngoaiThanh.xuatDanhSachXe(dsNgoaiThanh, n2);

        System.out.println("\n===================================================\n");
        
        System.out.println("Tong doanh thu chuyen xe noi thanh: " + noiThanh.tongDoanhThu(dsNoiThanh, n1));
        System.out.println("Tong doanh thu chuyen xe ngoai thanh: " + ngoaiThanh.tongDoanhThu(dsNgoaiThanh, n2));

        System.out.println("\n===================================================\n");

        noiThanh.xuatChuyenXeNoiThanhCoDoanhThuCaoNhat(dsNoiThanh, n1);
        ngoaiThanh.xuatChuyenXeNgoaiThanhCoDoanhThuCaoNhat(dsNgoaiThanh, n2);
        
        System.out.println("\n===================================================\n");

        }
    
}
