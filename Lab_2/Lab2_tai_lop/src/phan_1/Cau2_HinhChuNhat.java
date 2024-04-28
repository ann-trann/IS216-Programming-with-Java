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
public class Cau2_HinhChuNhat {
    static class HinhChuNhat{
        private double dai;
        private double rong;

        HinhChuNhat(){};
        HinhChuNhat(double x,double y){
            this.dai=x;
            this.rong=y;
        }

        public double getdai(){
            return dai;
        }
        public double getrong(){
            return rong;
        }
        public void setdai(double x){
            this.dai=x;
        }
        public void setrong(double x){
            this.rong=x;
        }

        public double dientich(){
            return dai*rong;
        }
        public double chuvi(){
            return 2*(dai+rong);
        }
        public String toString(){
            return "dai: "+dai+"\nrong: "+rong+"\ndien tich: "+dientich()+"\nchu vi: "+chuvi();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();

        System.out.print("Nhap chieu dai: ");
        hcn.setdai(sc.nextDouble());
        System.out.print("Nhap chieu rong: ");
        hcn.setrong(sc.nextDouble());
        
        System.out.println("--- Thong tin hinh chu nhat: ");
        System.out.println(hcn.toString());
    }
    
}
