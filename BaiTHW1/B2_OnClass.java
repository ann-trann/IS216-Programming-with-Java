/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class B2_OnClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a, b;
        a = sc.nextFloat();
        b = sc.nextFloat();
        while (b == 0){
            System.out.printf("So bi chia phai khac khong\n");
            System.out.printf("Nhap lai: ");
            b = sc.nextFloat();
        }
        float ans = 0;
        ans = a / b;
        System.out.printf("Ta co ket qua: %.3f", ans);   
    }
}
