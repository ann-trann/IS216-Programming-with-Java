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

public class Bai_2 {
    
    public static int UCLN(int a, int b){
        if (b == 0) return a;
        return UCLN(b, a%b);
    }
    
    public static int BCNN(int a, int b){
        return a * b / UCLN(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so nguyen b: ");
        int b = sc.nextInt();
        
        System.out.println("Boi chung nho nhat cua a va b: " + BCNN(a,b));
    }
    
}
