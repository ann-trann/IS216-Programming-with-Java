/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai04;

/**
 *
 * @author 7713b
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Xe> list_xe = new ArrayList<Xe>();
        do {
            Xe xe = new Xe();
            if (!xe.Nhap()) {
                break;
            }
            list_xe.add(xe);
        } while (true);

        double tongTienThue = 0;
        for (int i = 0; i < list_xe.size(); i++) {
            tongTienThue += list_xe.get(i).soTienThue();
        }
        System.out.println("Tong thue la: " + tongTienThue);

        String tencs, loaixe;
        System.out.print("Nhap ten chu xe: ");
        tencs = sc.nextLine();
        System.out.print("Nhap ten loai xe: ");
        loaixe = sc.nextLine();

        for (int i = 0; i < list_xe.size(); i++) {
            if (list_xe.get(i).getTenCS().equals(tencs) && list_xe.get(i).getLoaiXe().equals(loaixe)) {
                System.out.println("Thue phai dong cua chu xe: " + list_xe.get(i).soTienThue());
            }
        }
    }
}
