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

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("##################################");
        System.out.println("1.              Bai 1");
        System.out.println("2.              Bai 2");
        System.out.println("3.              Bai 3");
        System.out.println("4.              Bai 4");
        System.out.println("5.              Bai 5");
        System.out.println("6.              Thoat");
        
        System.out.print("Chon chuc nang: ");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1 -> Bai_1.main(args);
            case 2 -> Bai_2.main(args);
            case 3 -> Bai_3.main(args);
            case 4 -> Bai_4.main(args);
            case 5 -> Bai_5.main(args);
            case 6 -> System.out.println("Thoat");
            default -> System.out.println("Chuc nang khong hop le");
        }
    }
}
