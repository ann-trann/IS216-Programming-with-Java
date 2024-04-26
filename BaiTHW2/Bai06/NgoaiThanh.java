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

public class NgoaiThanh extends ChuyenXe {

    private String noiDen;
    private int soNgayVanChuyen;

    @Override
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap noi den: ");
        noiDen = sc.nextLine();
        System.out.print("Nhap so ngay van chuyen: ");
        soNgayVanChuyen = sc.nextInt();
    }

    @Override
    int getLoai() {
        return 2;
    }
}
