/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai08;

/**
 *
 * @author 7713b
 */
public abstract class Xe {

    protected double soXang, khoiLuong;
    protected double motKmTonSoLitXang;

    void themLuongHang(int kg) {
        this.khoiLuong += kg;
    }

    void botLuongHang(int kg) {
        this.khoiLuong = (kg > khoiLuong) ? 0 : khoiLuong - kg;
    }

    void doXang(int xang) {
        soXang += xang;
    }

    boolean conXang() {
        return soXang != 0;
    }

    void chayXe(int m) {
        chayMotKmTonSoLitXang();
        if (m / motKmTonSoLitXang >= soXang) {
            System.out.println("Chay het " + m + " km");
        } else {
            double quangDuong = motKmTonSoLitXang * soXang;
            System.out.println("Chay duoc " + quangDuong + " vi xe het xang.");
        }
    }

    abstract void chayMotKmTonSoLitXang();
}
