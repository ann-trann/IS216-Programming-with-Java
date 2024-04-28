/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau4_Xe;


/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Xe {
    protected float luongHang;
    protected float litXang;
    protected float chayTonXang;
    protected float choTonXang;
    
    public void themHangLenXe(){
        Scanner sc = new Scanner(System.in);
        float hang = sc.nextFloat();
        this.luongHang += hang;
    }
    
    public void botHangXuongXe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n----- Nhap so luong hang muon bot xuong: ");
        float hang = sc.nextFloat();
        while (hang > this.luongHang){
            System.out.print("----- So hang tren xe khong du, nhap lai: ");
            hang = sc.nextFloat();
        }
    }

    public void doXang(){
        Scanner sc = new Scanner(System.in);
        float xang = sc.nextFloat();
        this.litXang += xang;
    }

    public void chayXe(){
        Scanner sc = new Scanner(System.in);
        float quangDuong = sc.nextFloat();
        while (quangDuong > this.litXang / this.chayTonXang){
            System.out.print("Xang khong du, nhap lai quang duong: ");
            quangDuong = sc.nextFloat();
        }
        this.litXang -= quangDuong * this.chayTonXang;
    }

    public void kiemTraHetXang(){
        if (this.litXang == 0){
            System.out.println("Xe het xang");
        }
    }

    public void luongXangConLai(){
        System.out.println("So lit xang con: "+this.litXang);
    }
    
    
}
