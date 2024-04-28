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


public class Bai_3 {
    
    public int TuSo;
    public int MauSo;
    
    public Bai_3(int tu, int mau) {
        this.TuSo = tu;
        this.MauSo = mau;
    }

    public static Bai_3 nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Tu so: ");
        int TuSo = sc.nextInt();
        System.out.print(" - Mau so: ");
        int MauSo = sc.nextInt();
        while (MauSo == 0) {
            System.out.print("  *Mau so khong hop le. Nhap lai: ");
            MauSo = sc.nextInt();
        }
        return new Bai_3(TuSo, MauSo);
    }
    
    public static void xuatPhanSo(Bai_3 ps) {
        if (ps.TuSo % ps.MauSo == 0) {
            System.out.println(ps.TuSo / ps.MauSo);
        }
        else {
            System.out.println((ps.TuSo*ps.MauSo)/Math.abs(ps.MauSo) + "/" + Math.abs(ps.MauSo));
        }
}

    public static int UCLN(int a, int b) {
        if (b == 0) return a; 
        return UCLN(b, a%b);
    }
    public static Bai_3 rutGon(Bai_3 ps) {
        int ucln = UCLN(ps.TuSo, ps.MauSo);
        ps.TuSo /= ucln;
        ps.MauSo /= ucln;
        return ps;
    }
    
    public static Bai_3 Cong(Bai_3 A, Bai_3 B) {
        Bai_3 C = new Bai_3(A.TuSo*B.MauSo + A.MauSo*B.TuSo, A.MauSo*B.MauSo);
        return rutGon(C);
    }
    
    public static Bai_3 Tru(Bai_3 A, Bai_3 B) {
        Bai_3 C = new Bai_3(A.TuSo*B.MauSo - A.MauSo*B.TuSo, A.MauSo*B.MauSo);
        return rutGon(C);
    }
    
    public static Bai_3 Nhan(Bai_3 A, Bai_3 B) {
        Bai_3 C = new Bai_3(A.TuSo*B.TuSo, A.MauSo*B.MauSo);
        return rutGon(C);
    }
    
    public static Bai_3 Chia(Bai_3 A, Bai_3 B) {
        Bai_3 C = new Bai_3(A.TuSo*B.MauSo, A.MauSo*B.TuSo);
        return rutGon(C);
    }
    
    public static void main(String[] args) {    
        System.out.println("Nhap phan so A: ");
        Bai_3 A = Bai_3.nhapPhanSo();
        System.out.println("Nhap phan so B: ");
        Bai_3 B = Bai_3.nhapPhanSo();
        A = rutGon(A);
        B = rutGon(B);
              
        Bai_3 Cong = Cong(A, B);
        Bai_3 Tru = Tru(A, B);
        Bai_3 Nhan = Nhan(A, B);
        Bai_3 Chia = Chia(A, B);
        
        System.out.print("Phep cong hai phan so A + B: ");
        xuatPhanSo(Cong);
        System.out.print("Phep tru hai phan so A - B: ");
        xuatPhanSo(Tru);
        System.out.print("Phep nhan hai phan so A * B: ");
        xuatPhanSo(Nhan);
        if (B.TuSo == 0){
            System.out.println("Khong the chia cho 0.");
        } else{
            System.out.print("Phep chia hai phan so A / B: ");
            xuatPhanSo(Chia);
        }
    }
}
