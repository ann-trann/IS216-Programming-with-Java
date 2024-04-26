/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author 7713b
 */
public class B8_OnClass {
    public static void main(String[] args){
        int t = 1;
        System.out.print("X \t");
        for (int i = 1; i < 11; i++){
            System.out.print(i + " \t");
        }
        System.out.println();
        for (int i = 1; i < 11; i++){
            System.out.print(i + " \t");
            for (int j = 1; j <= 10; j++){
                System.out.print(j * t + " \t");
            }
            System.out.println();
            t++;
        }
    }
}
