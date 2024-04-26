/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai03;

/**
 *
 * @author 7713b
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(12344, "Nguyen Van A", 9, 8);
        SinhVien sv2 = new SinhVien(12233, "Nguyen Van B", 10, (float) 7.5);
        SinhVien sv3 = new SinhVien(14433, "Nguyen Van C", 4, 3);
        System.out.print(sv1.toString() + sv2.toString() + sv3.toString());
    }
}
