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

public class B3_Homework {
    static int ts, ms;
    
    static int UCLN(int a, int b){
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    static void rutGon(){
        ts = ts / UCLN(ts, ms);
        ms = ms / UCLN(ts, ms);
        if (ms < 0){
            if (ts > 0) ts *= -1;
            ms *= -1;
        }
        if (ts == 0) System.out.print(0);
        else if (ms == 1) System.out.print(ts);
        else System.out.print(ts + "/" + ms);
    }
    
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ts = sc.nextInt();
        ms = sc.nextInt();
        while (ms == 0){
            System.out.print("Mau so khong hop le, nhap lai: ");
            ms = sc.nextInt();
        }
        rutGon();
    }
}
