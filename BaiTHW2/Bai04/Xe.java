/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai04;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

class Xe {

    private String tencs;
    private String loaiXe;
    private double triGia;
    private double dungtich;

    public String getTenCS() {
        return tencs;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public double soTienThue() {
        if (dungtich < 100) {
            return 0.01 * triGia;
        } else if (dungtich < 175) {
            return 0.03 * triGia;
        } else {
            return 0.05 * triGia;
        }
    }

    public boolean Nhap() {
        Scanner sc = new Scanner(System.in);
        tencs = sc.nextLine();
        if (tencs.trim().isEmpty()){
            return false;
        }
        loaiXe = sc.nextLine();
        triGia = sc.nextDouble();
        dungtich = sc.nextDouble();
        return true;
    }
}
