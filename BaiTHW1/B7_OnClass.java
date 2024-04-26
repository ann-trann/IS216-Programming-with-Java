/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author 7713b
 */
public class B7_OnClass {
    static boolean checkSNT(int number){
        if (number  < 2){
            return false;
        }
        for (int i = 2; i < sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so can kiem tra: ");
        int number = sc.nextInt();
        if (checkSNT(number)){
            System.out.print(number + " la so nguyen to");
        }
        else System.out.print(number + " khong phai la so nguyen to");
    }
}
