/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau4_Xe;


/**
 *
 * @author trant
 */
public class XeTai extends Xe{
    private float chayTonXang;
    private float choTonXang;
    
    public XeTai() {
        chayTonXang = 20 / 100;
        choTonXang = 1 / 100;
    }

    public void themHangLenXe(){
        System.out.print("Nhap so luong hang muon them len xe tai: ");
        super.themHangLenXe();
    }

    public void botHangXuongXe(){
        System.out.print("So hang hien tai tren xe tai: "+this.luongHang
                +"\n----- Nhap so luong hang muon bot xuong:");
        super.botHangXuongXe();
    }

    public void doXang(){
        System.out.print("Nhap so luong xang muon do vao xe tai: ");
        super.doXang();
    }

    public void chayXe(){
        System.out.print("Nhap quang duong xe tai muon di (<"+this.litXang / this.chayTonXang+"km): ");
        super.chayXe();
    }
    
}
