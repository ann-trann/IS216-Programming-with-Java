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
import java.util.Arrays;

public class Bai_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n (n>=3): ");
        int n = sc.nextInt();
        while(n<3){
            System.out.print("  Nhap lai n (n>3): ");
            n = sc.nextInt();
        }
        int[] A = new int[n];
        System.out.println("Nhap mang so nguyen A co " + n +" phan tu: ");
        for (int i = 0; i < n; i++){
            System.out.print("A[" + i +  "]: ");
            A[i] = sc.nextInt();
        }
        
        System.out.print("Nhap so nguyen m (m>=3): ");
        int m = sc.nextInt();
        while(m<3){
            System.out.print("  Nhap lai n (m>3): ");
            m = sc.nextInt();
        }
        int[] B = new int[m];
        System.out.println("Mang so nguyen B co " + m +" gia tri ngau nhien: ");
        for (int i = 0; i < m; i++){
            B[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(B));
        
        int[] C = Arrays.copyOf(A, n);
        System.out.println("Mang C copy tu mang A: " + Arrays.toString(C));
        
        
        System.arraycopy(B, n-3, C, 0, 3);        
        System.out.println("Thay the phan tu thu 1->3 cua mang C bang 3 phan tu cuoi cua mang B:");
        System.out.println(Arrays.toString(C));
        
        Arrays.sort(C);
        System.out.println("Sap xep mang C tang dan: " + Arrays.toString(C));
        
        
    }
    
}
