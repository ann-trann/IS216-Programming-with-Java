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
import java.util.ArrayList;
import java.util.List;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi x: ");
        String str_x = sc.nextLine();
        System.out.print("Nhap chuoi y: ");
        String str_y = sc.nextLine();
        System.out.println("\n--------------------\n");
        
//        1. Tong chieu dai cua chuoi x
        int len_x = str_x.length();
        int len_y = str_y.length();
        System.out.println("Tong chieu dai cua chuoi x: " + len_x);
        
//        2. 3 ky tu dau cua chuoi x
        if (len_x >= 3) {
            System.out.println("3 ki tu dau tien cua chuoi x: " + str_x.substring(0, 3));
        } else {
            System.out.println(len_x + " ki tu dau cua chuoi: " + str_x);
        }
        
//        3. 3 ky tu cuoi cua chuoi x
        if (len_x >= 3) {
            System.out.println("3 ki tu cuoi cua chuoi x: " + str_x.substring(len_x - 3));
        } else {
            System.out.println(len_x + " ki tu cuoi cua chuoi: " + str_x);
        }
        
//        4. ky tu thu 6 cuoi chuoi x
        if (len_x > 5) {
        System.out.println("Ki tu thu 6 cua chuoi x: "  + str_x.charAt(5));
        } else {
            System.out.println("Chuoi x co " + len_x + " ki tu, khong co ki tu thu 6.");
        }
        
//        5. chuoi moi gom 3 ki tu dau str_x va 3 ki tu cuoi str_y
        String str_z = "";
        if (len_x > 3) {
            str_z = str_x.substring(0, 3);
        } else {
            str_z = str_x;
        }
        if (len_y > 3) {
            str_z += str_y.substring(len_y - 3);
        } else {
            str_z += str_y;
        }
        System.out.println("Chuoi moi gom 3 ki tu dau cua chuoi x va 3 ki tu cuoi cua chuoi y: " + str_z);

//        6. kiem tra 2 chuoi x, y co bang nhau (phan biet hoa, thuong)
        if (str_x.equals(str_y)) {
            System.out.println("Hai chuoi x va y bang nhau (phan biet hoa thuong)");
        } else {
            System.out.println("Hai chuoi x va y khong bang nhau (phan biet hoa thuong)");
        }        

//        7. kiem tra 2 chuoi x, y co bang nhau (khong phan biet hoa, thuong)
        if (str_x.equalsIgnoreCase(str_y)) {
            System.out.println("Hai chuoi x va y bang nhau (khong phan biet hoa thuong)");
        } else {
            System.out.println("Hai chuoi x va y khong bang nhau (khong phan biet hoa thuong)");
        }  

//        8. kiem tra y co xuat hien trong x, tai vi tri nao
        int flag = str_x.indexOf(str_y);
        if (flag == -1){
                System.out.println("Chuoi y khong xuat hien trong x.");
        } else {
            System.out.println("Chuoi y xuat hien trong chuoi x tai vi tri " + flag);
        }
        
//        9. tat ca vi tri xuat hien cua y trong x
        List<Integer> positions = new ArrayList<>();
        int index = str_x.indexOf(str_y);
        while (index >= 0) {
            positions.add(index);
            index = str_x.indexOf(str_y, index + 1);
        }
        
        if (!positions.isEmpty()) {
            System.out.print("Vi tri xuat hien cua y trong chuoi x: ");
            for (int pos : positions) {
                System.out.print(pos + " ");
            }
        }
        System.out.println("\n");
    }
}
