/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_1;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Cau1_Diem {
    static class Pointer {
        private float x, y;

        Pointer() {
            x = 0;
            y = 0;
        }

        Pointer(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Pointer Nhap() {
            Scanner sc = new Scanner(System.in);
            Pointer p = new Pointer();
            System.out.print("  - Nhap x: ");
            x = sc.nextInt();
            System.out.print("  - Nhap y: ");
            y = sc.nextInt();
            return p;
        }

        void Xuat() {
            System.out.println("(" + x + ", " + y + ")");
        }

        void KhoangCach(Pointer p) {
            double kc = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
            System.out.println("--- Khoang cach giua 2 diem la: " + kc);
        }

    }

    public static void main(String[] args) {
        Pointer a = new Pointer();
        Pointer b = new Pointer();
        System.out.println("Nhap toa do diem A: ");
        a.Nhap();
        System.out.println("Nhap toa do diem B: ");
        b.Nhap();

        System.out.print("--- Toa do diem A: ");
        a.Xuat();
        System.out.print("--- Toa do diem B: ");
        b.Xuat();

        a.KhoangCach(b);
    }
}
