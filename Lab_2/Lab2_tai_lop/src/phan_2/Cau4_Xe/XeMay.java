/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau4_Xe;


/**
 *
 * @author trant
 */
public class XeMay extends Xe{
    private float chayTonXang;
    private float choTonXang;
    
    public XeMay() {
        chayTonXang = 2 / 100;
        choTonXang = (float) (0.1 / 10);
    }

    public void themHangLenXe(){
        System.out.print("Nhap so luong hang muon them len xe may: ");
        super.themHangLenXe();
    }

    public void botHangXuongXe(){
        System.out.print("So hang hien tai tren xe may: "+this.luongHang);
        super.botHangXuongXe();
    }

    public void doXang(){
        System.out.print("Nhap so luong xang muon do vao xe may: ");
        super.doXang();
    }

    public void chayXe(){
        System.out.print("Nhap quang duong xe may muon di (<"+this.litXang / this.chayTonXang+"km): ");
        super.chayXe();
    }
}
