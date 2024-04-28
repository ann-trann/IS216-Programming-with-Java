/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ve_nha;

/**
 *
 * @author trant
 */

import java.util.Arrays;
import java.util.Scanner;

public class Bai_7 {
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        System.out.print("Nhap so nguyen m: ");
        int m = sc.nextInt();
        
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("Nhap A["+(i+1)+"]["+(j+1)+"]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang A: ");
        int x = 0, y = 0;
        int Max = A[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
                if (Max < A[i][j]){
                    Max = A[i][j];
                    x = i+1; y = j+1;
                }
            }
            System.out.println();
        }
        System.out.println("Phan tu lon nhat cua mang A la : A["+x+"]["+y+"] = "+ Max);
        
        System.out.println("Phan tu la so nguyen to trong mang: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (isPrime(A[i][j])) {
                    System.out.print(A[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        System.out.println("Sap xep cac cot theo thu tu tang dan: ");
        for (int j = 0; j < m; j++){
            int[] column = new int[n];
            for (int i = 0; i < n; i++){
                column[i] = A[i][j];
            }
            Arrays.sort(column);
            for (int i = 0; i < n; i++){
                A[i][j] = column[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
