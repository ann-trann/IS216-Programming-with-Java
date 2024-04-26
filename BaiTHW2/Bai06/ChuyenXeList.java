/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai06;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class ChuyenXeList {

    private ChuyenXe[] cx;
    private int n;
    private double tongDoanhThu;

    ChuyenXeList() {
        n = 0;
        cx = new ChuyenXe[0];
    }

    void Nhap() {
        tongDoanhThu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong chuyen xe di: ");
        n = sc.nextInt();
        cx = new ChuyenXe[n];
        int check = 0;
        System.out.println("1. Noi thanh\n2. Ngoai thanh");
        for (int i = 0; i < n; i++) {
            check = sc.nextInt();
            if (check == 1) {
                System.out.println("Nhap thong tin chuyen xe noi thanh:");
                cx[i] = new NoiThanh();
                cx[i].Nhap();
            } else {
                System.out.println("Nhap thong tin chuyen xe ngoai thanh:");
                cx[i] = new NgoaiThanh();
                cx[i].Nhap();
            }
            tongDoanhThu += cx[i].soDoanhThu();
        }
    }

    void xuatTheoBai() {
        System.out.println("Tong doanh thu: " + tongDoanhThu);
        double maxNoiThanh, maxNgoaiThanh;
        maxNoiThanh = maxNgoaiThanh = 0;
        for (int i = 0; i < n; i++) {
            if (cx[i].getLoai() == 1) {
                if (cx[i].doanhThu > maxNoiThanh) {
                    maxNoiThanh = cx[i].doanhThu;
                }
            } else {
                if (cx[i].doanhThu > maxNgoaiThanh) {
                    maxNgoaiThanh = cx[i].doanhThu;
                }
            }
        }
        System.out.println("Doanh thu cao nhat noi thanh: " + maxNoiThanh);
        System.out.println("Doanh thu cao nhat ngoai thanh: " + maxNgoaiThanh);
    }
}
