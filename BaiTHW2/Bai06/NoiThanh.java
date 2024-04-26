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

public class NoiThanh extends ChuyenXe {

    private double quangDuong;

    @Override
    int getLoai() {
        return 1;
    }

    @Override
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhap quang duong: ");
        quangDuong = sc.nextDouble();
    }
}
