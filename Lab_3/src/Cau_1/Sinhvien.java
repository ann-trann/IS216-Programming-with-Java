/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau_1;

/**
 *
 * @author trant
 */
import java.util.*;

public class Sinhvien {

    public long masv;
    public String tensv;
    public double diem;

    public Sinhvien() {
    }
    
    public Sinhvien(long masv, String tensv, double diem) {
        this.masv = masv;
        this.tensv = tensv;
        this.diem = diem;
    }

    public long getMasv() {
        return masv;
    }

    public void setMasv(long masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Ma: " + masv + ",\t Ten: " + tensv + ",\t Diem: " + diem + '}';
    }
    
    
    public void nhapSinhVien() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Nhap ma sinh vien: ");
            masv = scanner.nextLong();

            if (masv <= 0) {
                throw new IllegalArgumentException("Ma sinh vien phai la mot so nguyen duong.");
            }
            
            scanner.nextLine();
            System.out.print("Nhap ten sinh vien: ");
            tensv = scanner.nextLine();
            // Kiểm tra xem chuỗi tên có chứa ký tự đặc biệt không
            if (tensv.matches(".*[0-9!@#$%^&*(),.?\":{}|<>].*")) {
                throw new IllegalArgumentException("Ten sinh vien khong duoc chua so hoac ky tu dac biet.");
            }
            
            System.out.print("Nhap diem sinh vien: ");
            diem = scanner.nextDouble();
            if (diem < 0 || diem > 10) {
                throw new IllegalArgumentException("Diem sinh vien phai nam trong khoang tu 0 den 10.");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Du lieu nhap vao khong hop le.");
        }

    }
    

    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();

        try {
            sv.nhapSinhVien();
            System.out.println("Thong tin sinh vien:");
            System.out.println(sv.toString());
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    
}
