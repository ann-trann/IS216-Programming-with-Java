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

public class Cau3_SinhVien {
    static class SinhVien{
        private int mssv;
        private String hoTen;
        private float diemLT;
        private float diemTH;
        
        SinhVien(){};
        SinhVien(int mssv, String hoten, float diemLT, float diemTH){
            this.mssv=mssv;
            this.hoTen=hoten;
            this.diemLT=diemLT;
            this.diemTH=diemTH;
        }
        public int getmssv(){
            return mssv;
        }
        public String gethoTen(){
            return hoTen;
        }
        public float getDiemLT(){
            return diemLT;
        }
        public float getdDiemTH(){
            return diemTH;
        }
        public void setmaSV(int mssv){
            this.mssv=mssv;
        }
        public void sethoTen(String hoten){
            this.hoTen=hoten;
        }
        public void setDiemLT(float x){
            this.diemLT=x;
        }
        public void setDiemTB(float x){
            this.diemTH=x;
        }
        
        public float diemTB(){
            return (diemLT+diemTH)/2;
        }

        public String toString(){
            return "Ten: "+hoTen+"\tMaSV: "+mssv+"\tDiemLT: "+diemLT+"\tDiemTH: "+diemTH+"\tDiemTB: "+diemTB();
        }
    }

    static void nhap(SinhVien sv){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Ma sinh vien: "); sv.setmaSV(sc.nextInt());
        System.out.print(" - Ho ten: "); sv.sethoTen(new Scanner(System.in).nextLine());
        System.out.print(" - Diem LT: "); sv.setDiemLT(sc.nextFloat());
        System.out.print(" - Diem TH: "); sv.setDiemTB(sc.nextFloat());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien();
        System.out.println("Nhap thong tin sv1: "); nhap(sv1);
        
        
        SinhVien sv2 = new SinhVien();
        System.out.println("Nhap thong tin sv2: "); nhap(sv2);

        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap thong tin sv3: "); nhap(sv3);


        System.out.println("\n---------------- Thong tin sinh vien ----------------");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
    
}
