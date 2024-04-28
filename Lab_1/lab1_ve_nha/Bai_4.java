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

public class Bai_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("  *So khong hop le. Nhap lai: ");
            n = sc.nextInt();
        }
        System.out.print("Cac uoc cua " + n + ": ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
