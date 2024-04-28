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

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
        System.out.printf("%.3f", a/b);
        System.out.println("\n");
    }
    
}
