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

public class B4_OnClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println("Chieu dai chuoi x: " + str1.length());
        if (str1.length() > 2) {
            System.out.println("3 ky tu dau tien cua x la: " + str1.substring(0, 3));
            System.out.println("3 ky tu cuoi cua chuoi x la: " + str1.substring(str1.length() - 3));
        } else {
            System.out.println("Chuoi co it hon 6 ky tu");
        }

        if (str1.length() > 5) {
            System.out.println("Ky tu thu 6 cua chuoi x la: " + str1.charAt(5));
        } else {
            System.out.println("Chuoi co it hon 6 ky tu");
        }

        if (str1.length() > 2 && str2.length() > 2) {
            String new_str = str1.substring(0, 3) + str2.substring(0, 3);
            System.out.println("Chuoi moi: " + new_str);
        } else {
            System.out.println("Mot trong 2 chuoi co it hon 3 ky tu");
        }

        if (str1.equals(str2)) {
            System.out.println("Hai chuoi co bang");
        } else {
            System.out.println("Hai chuoi phan biet");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Hai chuoi co bang khong phan biet hoa thuong");
        } else {
            System.out.println("Hai chuoi khac nhau");
        }
        int pos = str1.indexOf(str2);
        if (pos > -1) {
            System.out.println("y co trong x voi vi tri lan luot la");
            while (pos != -1) {
                System.out.print(pos + " ");
                pos = str1.indexOf(str2, pos + 1);
            } 
        } else {
            System.out.println("y khong co trong x");
        }
    }
}
