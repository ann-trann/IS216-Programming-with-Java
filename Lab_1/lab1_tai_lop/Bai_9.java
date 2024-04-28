/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_tai_lop;

/**
 *
 * @author trant
 */

import java.util.Scanner;
import java.util.Arrays;

public class Bai_9 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang so nguyen " + n + " phan tu: ");
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Cac phan tu trong mang: " + Arrays.toString(arr));    
        System.out.println("----------------");
        
        
        System.out.println("Tim phan tu lon nhat va nho nhat");
        int Max = arr[0];
        int Min = arr[0];
        for (int i = 1; i < n; i++){
            Max = Math.max(arr[i], Max);
            Min = Math.min(arr[i], Min);
        }
        
        System.out.println("Phan tu lon nhat: " + Max);
        System.out.println("Phan tu nho nhat: " + Min);
        System.out.println("----------------");


        System.out.println("Kiem tra x co nam trong mang");
        System.out.print("Nhap vao mot so x: ");
        int x = sc.nextInt();
        if (Arrays.binarySearch(arr, x) < 0) {
            System.out.println(x + " khong co trong mang");
        } else {
            System.out.println(x + " co trong mang");
        }       
        System.out.println("----------------");      
                
        
        Arrays.sort(arr);
        System.out.println("Sap xep mang tang dan: " + Arrays.toString(arr));
        System.out.println("----------------");
    }
}
