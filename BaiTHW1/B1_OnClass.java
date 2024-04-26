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

public class B1_OnClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = -1;
        while (r <= 0){
            r = sc.nextFloat();
        }
        double p = 1;
        p = 2 * r * Math.PI;
        System.out.println("Chu vi la: " + p);
    }
}

