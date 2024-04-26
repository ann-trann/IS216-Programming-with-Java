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

public class Carrier extends Robot {

    private double E;

    Carrier(int S) {
        super(S);
        M = 30;
        E = random() * 50 + 50;
    }

    @Override
    double nangLuongTieuThu() {
        return M * S + 4 * E * S;
    }

    @Override
    int getloai() {
        return 3;
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println(", E: " + E + ", nang luong tieu thu: " + this.nangLuongTieuThu());
    }
}
