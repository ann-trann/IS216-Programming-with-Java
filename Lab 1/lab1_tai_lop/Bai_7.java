package lab1_tai_lop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("So khong hop le. Nhap lai: ");
            n = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        
        if (flag){
            System.out.println(n + " la mot so nguyen to");
        }
        else {
            System.out.println(n + " khong phai la mot so nguyen to");
        }
    }
}
