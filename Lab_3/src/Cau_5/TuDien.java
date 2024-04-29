/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_5;

/**
 *
 * @author trant
 */

import java.util.TreeMap;

public class TuDien {
    private TreeMap <String, Tu> listTu;

    public TuDien() {
        listTu = new TreeMap<>();
    }
    
    public void themTu(String tu, String nghia, String loai, String ghiChu){
        Tu tuMoi = new Tu(tu, nghia, loai, ghiChu);
        listTu.put(tu, tuMoi);
    }
    
    public void traTu(String tu){
        Tu timTu = listTu.get(tu);
        if (timTu != null){
            System.out.println(timTu.toString());
        }
        else {
            System.out.println("Khong tim thay tu.");
        }
    }
    
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        
        tuDien.themTu("apple", "qua tao", "n", "");
        tuDien.themTu("book", "sach", "n", "");
        tuDien.themTu("ball", "qua bong", "n", "");
        tuDien.themTu("run", "chay", "v", "");
        
        
        tuDien.traTu("apple");
        
    }
}
