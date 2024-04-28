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
        
public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double radius = sc.nextInt();
        while (radius < 0) {
            System.out.print("Ban kinh khong hop le. Nhap lai: ");
            radius = sc.nextInt();
        }
        
        double perimeter = Math.PI * radius;
        
        System.out.println("Chu vi cua hinh tron: " + perimeter + "\n");
        
    }
    
}
