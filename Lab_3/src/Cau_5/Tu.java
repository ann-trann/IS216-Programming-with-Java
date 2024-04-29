/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_5;

/**
 *
 * @author trant
 */
public class Tu {
    private String tu;
    private String nghia;
    private String loaiTu;
    private String ghiChu;

    public Tu(String tu, String nghia, String loaiTu, String ghiChu) {
        this.tu = tu;
        this.nghia = nghia;
        this.loaiTu = loaiTu;
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return tu + " [" + loaiTu + "]: " + nghia + " (" + ghiChu + ')';
    }
    
}
