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
import com.mycompany.javaproject.*;

public class B6_OnClass {
    public static void main(String[] args){
        String output = "##################################\n" +
                        "1. Bai 1\n" +
                        "2. Bai 2\n" +
                        "3. Bai 3\n" +
                        "4. Bai 4\n" +
                        "5. Bai 5\n" +
                        "6. Thoat\n" +
                        "##################################\n"+
                        "Chon chuc nang: _\n" +
                        "Chon chuc nang tu 1 đen 6 de goi cac ham da viet o bai 1 den 5";
        
        System.out.print(output);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        B1_OnClass b1 = new B1_OnClass();
        B2_OnClass b2 = new B2_OnClass();
        B3_OnClass b3 = new B3_OnClass();
        B4_OnClass b4 = new B4_OnClass();
        B5_OnClass b5 = new B5_OnClass();
        
        while (input != 6){
            switch(input){  
                case 1: b1.main(args);
                break;
                case 2: b2.main(args);
                break;
                case 3: b3.main(args);
                break;
                case 4: b4.main(args);
                break;
                case 5: b5.main(args);
                break;
            }
            input = sc.nextInt();
            if (input == 6){
                break;
            }
        }
    }
}
