/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai06;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;

public class ChuyenXe {

    protected String maSoChuyen;
    protected String hoTen;
    protected String soXe;
    protected double khoiLuong;
    protected double doanhThu;
    private int loai;

    double soDoanhThu() {
        return doanhThu;
    }

    int getLoai() {
        return 0;
    }

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so xe: ");
        maSoChuyen = sc.nextLine();
        System.out.print("Nhap ho ten tai xe: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = sc.nextLine();
        System.out.print("Nhap khoi luong hang hoa: ");
        khoiLuong = sc.nextDouble();
        System.out.print("Nhap doanh thu: ");
        doanhThu = sc.nextDouble();
    }
}
