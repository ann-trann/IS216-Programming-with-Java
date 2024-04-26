/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai10;

/**
 *
 * @author 7713b
 */
import java.util.Calendar;
import java.util.Scanner;

public class Date {

    public int dd, mm, yyyy;

    Date() {
        dd = 1;
        mm = 1;
        yyyy = 2000;
    }

    public Date(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        dd = sc.nextInt();
        System.out.print("Nhap thang: ");
        mm = sc.nextInt();
        System.out.print("Nhap nam: ");
        yyyy = sc.nextInt();
    }

    // Lưu dưới dạng 01/01/2000
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dd, mm, yyyy);
    }

    public int getMm() {
        return mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public int getDd() {
        return dd;
    }

    public boolean soSanh(Date another) {
        if (this.yyyy > another.getYyyy()) {
            return true;
        } else if (this.mm > another.getMm()) {
            return true;
        } else if (this.dd > another.getDd()) {
            return true;
        }
        return false;
    }

    public int hieu(Date another) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(yyyy, mm - 1, dd);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(another.yyyy, another.mm - 1, another.dd);

        long time1 = cal1.getTimeInMillis();
        long time2 = cal2.getTimeInMillis();

        long diff = Math.abs(time1 - time2);

        int daysDiff = (int) Math.ceil((double) diff / (1000 * 60 * 60 * 24));
        return daysDiff;
    }
}
