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

public class Zattacker extends Robot {

    private double P;

    Zattacker(int S) {
        super(S);
        P = 20 + random() * 10;
        M = 50;
    }

    @Override
    double nangLuongTieuThu() {
        return M * S + P * P * S;
    }

    @Override
    int getloai() {
        return 2;
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.println(", P: " + P + ", nang luong tieu thu: " + this.nangLuongTieuThu());
    }
}
