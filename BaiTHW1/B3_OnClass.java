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

public class B3_OnClass {
    int ts = 0, ms = 0;
    // Default Constructor
    B3_OnClass(){
        
    }
    // Constructor gán 2 giá trị ts và ms 
    B3_OnClass(int ts, int ms){
        this.ts = ts;
        this.ms = ms;
    }
    // Tìm UCLN để rút gọn
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    // Hàm nhập vào 2 phân số
    public static void Input(B3_OnClass ps){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap tu so: ");
        ps.ts = sc.nextInt();
        System.out.printf("Nhap mau so: ");
        ps.ms = sc.nextInt();
        while(ps.ms == 0){
            System.out.printf("Mau so phai khac 0\nNhap lai mau so: ");
            ps.ms = sc.nextInt();
        }
    }
    // Rút gọn phân số
    public static void RutGon(B3_OnClass ps){
        int uc = UCLN(ps.ts, ps.ms);
        ps.ts = ps.ts / uc;
        ps.ms = ps.ms / uc;
        if (ps.ms < 0){
            ps.ts = -ps.ts;
            ps.ms = -ps.ms;
        }
    }
    // Xuất phân số
    public static void Output(B3_OnClass ps){
        if (ps.ts == 0) {
            System.out.print(0);
            return;
        }
        RutGon(ps);
        if (ps.ms == 1){
            System.out.print(ps.ts + "\n");
            return;
        }
        System.out.printf(ps.ts + "/" + ps.ms + "\n");
    }
    
    public static B3_OnClass Tong(B3_OnClass ps1, B3_OnClass ps2){
        int ts, ms;
        ts = ps1.ts * ps2.ms + ps2.ts * ps1.ms;
        ms = ps1.ms * ps2.ms;
        B3_OnClass ans = new B3_OnClass(ts, ms);
        return ans;
    }
    
    public static B3_OnClass Hieu(B3_OnClass ps1, B3_OnClass ps2){
        int ts, ms;
        ts = ps1.ts * ps2.ms - ps2.ts * ps1.ms;
        ms = ps1.ms * ps2.ms;
        B3_OnClass ans = new B3_OnClass(ts, ms);
        return ans;
    }
    
    public static B3_OnClass Tich(B3_OnClass ps1, B3_OnClass ps2){
        int ts, ms;
        ts = ps1.ts * ps2.ts;
        ms = ps1.ms * ps2.ms;
        B3_OnClass ans = new B3_OnClass(ts, ms);
        return ans;
    }
    
    public static B3_OnClass Thuong(B3_OnClass ps1, B3_OnClass ps2){
        int ts, ms;
        ts = ps1.ts * ps2.ms;
        ms = ps1.ms * ps2.ts;
        B3_OnClass ans = new B3_OnClass(ts, ms);
        return ans;
    }
    
    public static void main(String[] args){
        B3_OnClass ps1 = new B3_OnClass();
        B3_OnClass ps2 = new B3_OnClass();
        System.out.printf("Nhap vao phan so dau tien: \n");
        Input(ps1);
        System.out.printf("Nhap vao phan so thu hai: \n");
        Input(ps2);
        B3_OnClass tong, hieu, tich, thuong = new B3_OnClass();
        tong = Tong(ps1, ps2);
        hieu = Hieu(ps1, ps2);
        tich = Tich(ps1, ps2);
        
        System.out.print("Tong" );
        Output(tong);
        System.out.print("Hieu" );
        Output(hieu);
        System.out.print("Tich " );
        Output(tich);
        
        if (ps2.ts == 0){
            System.out.print("Khong the chia do phan so thu 2 bang 0");
            return;
        }
        thuong = Thuong(ps1, ps2);
        System.out.print("Thuong " );
        Output(thuong);
    }
}