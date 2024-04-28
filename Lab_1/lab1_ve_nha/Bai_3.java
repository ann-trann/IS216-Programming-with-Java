/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ve_nha;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Bai_3 {
    
    public static int UCLN(int a, int b){
        if (b == 0) return a;
        return UCLN(b, a%b);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu: ");
        int tu = sc.nextInt();
        System.out.print("Nhap mau: ");
        int mau = sc.nextInt();
        while (mau == 0) {
            System.out.print("  *Mau so khong hop le. Nhap lai: ");
            mau = sc.nextInt();
        }
        
        int ucln = UCLN(tu, mau);
        tu /= ucln;
        mau /= ucln;
        if (tu % mau == 0) {
            System.out.println(tu / mau);
        }
        else {
            System.out.println((tu*mau)/Math.abs(mau) + "/" + Math.abs(mau));
        }
    }
    
}

