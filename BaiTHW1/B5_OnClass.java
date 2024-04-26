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
public class B5_OnClass {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int kW = sc.nextInt();
        while (kW < 0){
            System.out.print("So dien phai khong am, nhap lai: ");
            kW = sc.nextInt();
        }
        int money = 0;
        if (kW < 50){
            money = money * 2000;
        } else if (kW < 10000){
            money = 2500 * (kW - 50) + 2000 * 50;
        } else {
            money = kW * 3500;
        }
        System.out.print("So tien la: " + money);
    }
}
