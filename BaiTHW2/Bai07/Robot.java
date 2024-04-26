/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai07;

/**
 *
 * @author 7713b
 */
public abstract class Robot {

    protected double M;
    protected int S;

    Robot(int S) {
        this.S = S;
    }

    abstract double nangLuongTieuThu();

    abstract int getloai();
    
    void Xuat(){
        System.out.printf("S: " + S, ", M: " + M);
    }
}
