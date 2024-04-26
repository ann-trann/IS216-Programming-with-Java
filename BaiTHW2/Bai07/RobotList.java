/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai07;

/**
 *
 * @author 7713b
 */
import static java.lang.Math.max;
import static java.lang.Math.random;
import java.util.Scanner;

public class RobotList {

    private int n;
    private Robot[] rb;
    private final int S = 10;
    private double nlpedion, nlzattacker, nlcarrier, nltong;

    void Nhap() {
        nlpedion = nlzattacker = nlcarrier = nltong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong robot: ");
        n = sc.nextInt();
        rb = new Robot[n];
        System.out.println("1. Pedion\n2. Zattacker\n3. Carrier");
        int check;
        for (int i = 0; i < n; i++) {
            check = sc.nextInt();
            switch (check) {
                case 1:
                    rb[i] = new Pedion(S);
                    nlpedion += rb[i].nangLuongTieuThu();
                    break;
                case 2:
                    rb[i] = new Zattacker(S);
                    nlzattacker += rb[i].nangLuongTieuThu();
                    break;
                default:
                    rb[i] = new Carrier(S);
                    nlcarrier += rb[i].nangLuongTieuThu();
                    break;
            }
            nltong += rb[i].nangLuongTieuThu();
        }
    }

    void Xuat() {
        for (int i = 0; i < n; i++) {
            rb[i].Xuat();
        }
        System.out.println("Tong nang luong tieu thu: " + nltong);
        double _max = max(nlpedion, max(nlzattacker, nlcarrier));
        if (_max == nlpedion) {
            System.out.println("pedion tieu thu nang luong nhieu nhat");
        } else if (_max == nlzattacker) {
            System.out.println("zattaker tieu thu nang luong nhieu nhat");
        } else {
            System.out.println("carrier tieu thu nang luong nhieu nhat");
        }
    }
}
