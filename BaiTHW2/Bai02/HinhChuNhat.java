/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai02;

import java.util.Scanner;

/**
 *
 * @author 7713b
 */
class HinhChuNhat{
    private int chieuDai, chieuRong;
    
    public HinhChuNhat(){
        
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "Chieu dai: " + chieuDai + ", chieu rong: " + chieuRong + '\n';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextInt();
        chieuRong = sc.nextInt();
    }
    
}