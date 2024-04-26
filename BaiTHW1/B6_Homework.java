/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author 7713b
 */
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class B6_Homework {
    static void Output(int[] arr, int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Nhap so luong phan tu mang A: ");
        n = sc.nextInt();
        while (n < 1){
            System.out.print("Mang co nhieu hon 0 phan tu, nhap lai: ");
            n = sc.nextInt();
        }
        System.out.print("Nhap so luong phan tu mang B: ");
        m = sc.nextInt();
        while (m < 1){
            System.out.print("Mang co nhieu hon 0 phan tu, nhap lai: ");
            m = sc.nextInt();
        }
        int[] arrA = new int [n];
        int[] arrB = new int [m];
        System.out.println("Nhap phan tu mang A");
        for (int i = 0; i < n; i++){
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++){
            arrB[i] = (int)(Math.pow(10, (int)(Math.random() * 10))* Math.random());
        }
        Output(arrB, m);
        int[] arrC = new int[n];
        arrC = Arrays.copyOf(arrA, arrA.length);
        Output(arrC, arrC.length);
        if (arrB.length < 3) System.out.println("Mang B k du 3 phan tu");
        else System.arraycopy(arrB, 1, arrC, arrB.length - 4, 3);
        Arrays.sort(arrC);
        System.out.println("Mang C sau khi sap xep la: ");
        Output(arrC, n);
    }
}
