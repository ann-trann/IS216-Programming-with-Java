/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai07;

/**
 *
 * @author 7713b
 */
import static java.lang.Math.random;

public class Pedion extends Robot {

    private double F;

    Pedion(int S) {
        super(S);
        F = random() * 4 + 1;
        M = 20;
    }

    @Override
    double nangLuongTieuThu() {
        return M * S + (F + 1) / 2;
    }

    @Override
    int getloai() {
        return 1;
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println(", F: " + F + ", nang luong tieu thu: " + this.nangLuongTieuThu());
    }
}
