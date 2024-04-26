/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai09;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class Date {

    public int dd, mm, yyyy;

    Date() {
        dd = 1;
        mm = 1;
        yyyy = 2000;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        dd = sc.nextInt();
        System.out.print("Nhap thang: ");
        mm = sc.nextInt();
        System.out.print("Nhap nam: ");
        yyyy = sc.nextInt();
    }

    // Lưu dưới dạng 01/01/2000
    @Override
    public String toString() {
        return ((dd < 10) ? "0" + dd : dd) + "/" + ((mm < 10) ? "0" + mm : mm) + "/" + yyyy;
    }

    public int getMm() {
        return mm;
    }

    public int getYyyy() {
        return yyyy;
    }

}
