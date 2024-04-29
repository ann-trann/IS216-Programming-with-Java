/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau_3;

/**
 *
 * @author trant
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CongTy {

    private ArrayList<String> NhanVien;
    private HashSet<String> tenSP;
    private HashMap<String, Integer> countTen;
    private ArrayList<String> NVDangKy;
    private TreeMap<Integer, String> doanhSo;
    
    public CongTy(){
        NhanVien = new ArrayList<>();
        tenSP = new HashSet<>();
        countTen = new HashMap<>();
        NVDangKy = new ArrayList<>();
        doanhSo = new TreeMap<>(Collections.reverseOrder());
    }
    
    public void danhSachNV(){
        ArrayList<String> tenNV = new ArrayList<>(
        Arrays.asList("John", "Alice", "Mark", "Kelly", "Bob", "Laura", "Matthew", "Emma", "Michael", "James",
                      "Kelly", "June", "Thomas", "Charles", "Emily", "Thomas", "June", "Daniel", "James", "Paul",
                      "Matthew", "Carol", "Steven", "Laura", "Josh", "June", "Alice", "Andrew", "Carol", "Paul")
        );
        NhanVien.addAll(tenNV);
        System.out.println("Danh sach nhan vien: " + NhanVien);
        System.out.println("So luong nhan vien: " + NhanVien.size());
    }
    
    public void chonNgauNhienNV(){
        Random rand = new Random();
        String ten = NhanVien.get(rand.nextInt(NhanVien.size()));
        System.out.println("Nhan vien duoc chon ngau nhien: " + ten);
    }
    
    public void danhSachTenSP(){
        tenSP.addAll(NhanVien);
        System.out.println("Danh sach ten san pham: " + tenSP);
        System.out.println("So luong ten san pham: " + tenSP.size());
    }
    
    public void tenPhoBienNhat(){
        int maxCount = 0;
        String tenPB = "";
        for (String ten : NhanVien) {
            if (countTen.containsKey(ten)) {
                countTen.put(ten, countTen.get(ten) + 1);
                if (countTen.get(ten) > maxCount) {
                   maxCount = countTen.get(ten);
                   tenPB = ten;
                }
            }
            else {
                countTen.put(ten, 1);
            }
        }
        System.out.println("Ten pho bien nhat: " + tenPB);
    }
    
    public void dangKy(String name) {
        if (NVDangKy.size() >= 20) {
            System.out.println(name + " - Khong thanh cong. Da du so luong nguoi dang ky");
        } else {
            NVDangKy.add(name);
            System.out.println(NVDangKy.size() + ". " + name + " - Dang ky thanh cong");
        }
    }
    
    public void DSNVDangKy(){
        for (String ten : NhanVien) {
            dangKy(ten);
        }
        
        System.out.println("Danh sach nhan vien dang ky: " + NVDangKy);
    }
    
    public void danhSachDoanhSo(){
        doanhSo.put(1000, "Khach hang 1");
        doanhSo.put(3000, "Khach hang 2");
        doanhSo.put(5100, "Khach hang 3");
        doanhSo.put(6700, "Khach hang 4");
        doanhSo.put(1300, "Khach hang 5");
        doanhSo.put(3080, "Khach hang 6");
        
        System.out.println("\nDanh sach khach hang va doanh so: ");
        for (Integer kh : doanhSo.keySet()) {
            System.out.println(" " + doanhSo.get(kh) + ": " + kh);
        }
    }
    
    
    public static void main(String[] args) {
        CongTy congTy = new CongTy();
        congTy.danhSachNV();
        congTy.chonNgauNhienNV();
        congTy.danhSachTenSP();
        congTy.tenPhoBienNhat();
        System.out.println("\n- Dang ky du lich -");
        congTy.DSNVDangKy();
        congTy.danhSachDoanhSo();
    }
    
}
