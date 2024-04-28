/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_tai_lop;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien su dung cua thang: ");
        double soDien = sc.nextDouble();
        double tienDien;
        double gia = 2000;
        
        if (soDien <= 50) {
            tienDien = soDien * gia;
        }
        else if (soDien > 50 && soDien <= 100) {
            double giaVuotMuc = 2500;
            tienDien = 50*gia + (soDien-50)*giaVuotMuc;
        }
        else {
            double giaVuotMuc = 3500;
            tienDien = 50*gia + (soDien-50)*giaVuotMuc;
        }
        
        System.out.println("Tien dien cua thang: " + tienDien);
    }
}
