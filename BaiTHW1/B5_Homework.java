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

public class B5_Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m, c;
        System.out.print("Nhap vao do dai: ");
        m = sc.nextFloat();
        while (m < 0) {
            System.out.print("Khong hop le, nhap lai: ");
            m = sc.nextFloat();
        }
        System.out.print("Nhap vao nhiet do (theo do C): ");
        c = sc.nextInt();
        System.out.println("Do dai theo ft la: " + (m * 3.28));
        System.out.println("Nhiet do F la: " + (c * 1.8 + 32));
    }
}
