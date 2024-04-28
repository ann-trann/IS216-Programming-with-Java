/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ve_nha;


/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot do dai(m): ");
        int n = sc.nextInt();
        System.out.print("Nhap vao mot nhiet do(°C): ");
        int m = sc.nextInt();
        
        
        System.out.println(n + "m = " + n*3.28 + "ft");
        System.out.println(m + "°C = " + (m * 9/5 + 32) + "°F");

    }
}
