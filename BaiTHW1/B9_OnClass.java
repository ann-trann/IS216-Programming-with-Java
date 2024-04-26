/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author 7713b
 */
import java.util.Arrays;
import java.util.Scanner;
public class B9_OnClass {
    static void Print(int[] arr, int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu mang la: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //Nhap va xuat cac phan tu trong mang
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Print(arr, n);
        
        //Tim phan tu max va min
        int _max = arr[0], _min = arr[0];
        for (int i = 0; i < n ; i++){
            if (_max < arr[i]){
                _max = arr[i];
            }
            if (_min > arr[i]){
                _min = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat la: " + _max);
        System.out.println("Phan tu nho nhat la: " + _min);
        
        // Sap xep phan tu trong mang
        Arrays.sort(arr);
        System.out.println("Sau khi da sap xep, ta co mang:");
        Print(arr, n);
        
        
       // Tim kiem phan tu co trong mang
        System.out.print("Nhap vao so can kiem tra: ");
        int x;
        x = sc.nextInt();
        System.out.println(Arrays.binarySearch(arr, x));
        if (Arrays.binarySearch(arr, x) < 0) {
           System.out.println("Khong co trong mang");
        } else  System.out.println("Co trong mang");
       
       // Dem so phan tu bang x trong mang
       System.out.print("Nhap vao so can dem: ");
       x = sc.nextInt();
       int cnt = 0;
       for (int i = 0; i < n; i++){
           if (arr[i] == x) cnt++;
       }
       System.out.println("So phan tu bang " + x + " la: " + cnt);
    }
}
