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

public class B7_Homework {
    static void sangSNT(boolean[] bangsnt){
        for (int i = 2; i < 101; i++){
            if (bangsnt[i] == true){
                for (int j = 2 * i; j < 101; j = j + i){
                    bangsnt[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args){
        boolean[] bangsnt = new boolean[101];
        bangsnt[0] = bangsnt[1] = false;
        for (int i = 2; i < 101; i++){
            bangsnt[i] = true;
        }
        sangSNT(bangsnt);
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int [n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int _min = arr[0][0];
        int indexCol, indexRow;
        indexCol = indexRow = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (_min > arr[i][j]){
                    _min = arr[i][j];
                    indexCol = j;
                    indexRow = i;
                }
            }
        }
        System.out.println("So nho nhat trong mang " + _min + " o cot " + indexCol + " hang " + indexRow);
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (bangsnt[arr[i][j]]){
                    System.out.print(arr[i][j] + " ");
                }
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
        
        int[] subArr = new int[n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                subArr[j] = arr[j][i];
            }
            Arrays.sort(subArr);
            for (int j = 0; j < n; j++){
                arr[j][i] = subArr[j];
            }
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
