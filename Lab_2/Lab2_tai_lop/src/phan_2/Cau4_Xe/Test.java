/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau4_Xe;


/**
 *
 * @author trant
 */
public class Test {
    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        XeTai xeTai = new XeTai();

        System.out.println("=============== XE MAY ===============");
        xeMay.themHangLenXe();
        xeMay.botHangXuongXe();
        xeMay.doXang();
        xeMay.chayXe();
        
        System.out.println("=============== XE TAI ===============");
        xeTai.themHangLenXe();
        xeTai.botHangXuongXe();
        xeTai.doXang();
        xeTai.chayXe();
    }
    
}
