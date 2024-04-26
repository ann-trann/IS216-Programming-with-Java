/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai01;

/**
 *
 * @author 7713b
 */
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Point {

    private double x, y;

    Point() {
        x = y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    double tinhKhoangCach(Point another) {
        double new_x = this.x - another.getX();
        double new_y = this.y - another.getY();
        return sqrt(pow(new_x, 2) + pow(new_y, 2));
    }
}