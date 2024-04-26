/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai10;

/**
 *
 * @author 7713b
 */
import java.util.Scanner;
import java.time.LocalDateTime;

public class HangHoaGiaDung extends HangHoa {

    private String nhaSanXuat;
    private Date ngayNhapVaoST;
    private String loai;

    public HangHoaGiaDung() {
        ngayNhapVaoST = new Date();
    }

    public HangHoaGiaDung(String nhaSanXuat, Date ngayNhapVaoST, String loai, String maHang, String tenHang, double donGia, int soLuongTon) {
        super(maHang, tenHang, donGia, soLuongTon);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapVaoST = ngayNhapVaoST;
        this.loai = loai;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Hang Hoa Gia Dung--------------");
        super.nhapThongTin();
        System.out.println("Nhap ngay nhap vao sieu thi: ");
        ngayNhapVaoST.nhap();
        System.out.print("Nhap nha san xuat: " + nhaSanXuat);
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhap loai: ");
        loai = sc.nextLine();
    }

    @Override
    public void xuatThongTin() {
        System.out.println("------------Hang Hoa Gia Dung--------------");
        super.xuatThongTin();
        System.out.print("Nha san xuat: " + nhaSanXuat + "\t");
        System.out.print("Ngay nhap: " + ngayNhapVaoST.toString() + "\t");
        System.out.println("Loai: " + loai);
    }

    @Override
    String danhGiaMucDoBanBuon() {
        LocalDateTime currentDate = LocalDateTime.now();
        Date today = new Date(currentDate.getDayOfMonth(), currentDate.getMonthValue(), currentDate.getYear());
        int daysSinceInput = today.hieu(ngayNhapVaoST);

        if (soLuongTon > 10 && daysSinceInput > 20) {
            return "ban cham";
        }
        return "khong danh gia";
    }

    @Override
    double thanhTien() {
        return soLuongTon * donGia * 1.1;
    }

}
