/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau1_CtyDienLuc;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Date {
    public int dd, mm, yyyy;
    
    Date(){
        dd = 1;
        mm = 1;
        yyyy = 2000;
    }

    public Date(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
    
    public void Nhapngay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay:");
        dd = sc.nextInt();
        System.out.println("Nhap thang:");
        mm = sc.nextInt();
        System.out.println("Nhap nam:");
        yyyy = sc.nextInt();
    }

    @Override
    public String toString() {
        return dd + "/" + mm + "/" + yyyy;
    }

    public int getDd() {
        return dd;
    }
    public int getMm() {
        return mm;
    }
    public int getYyyy() {
        return yyyy;
    }
    
}
