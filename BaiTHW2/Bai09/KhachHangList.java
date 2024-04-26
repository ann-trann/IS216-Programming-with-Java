/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thw2.javaproject2.Bai09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 7713b
 */
public class KhachHangList {

    // Tạo 1 list khách hàng để không phụ thuộc vào số lượng khách hàng ban đầu
    private List<KhachHang> kh = new ArrayList<KhachHang>();

    // Biến loaiDien dùng để lưu kết quả loại điện của đối tượng có cùng tên và mã khách hàng
    private int loaiDien;

    // Check điều kiện nhập, 1 mã khách hàng không thể có 2 tên khách hàng được, ngoài ra, nếu cùng tên và mã khách hàng thì không được cùng ngày hóa đơn
    boolean checkDieuKienNhap(String makh, String tenkh, String ngayhd) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).getMaKh().equals(makh)) {
                if (!kh.get(i).getTenKh().equals(tenkh)) {
                    System.out.println(kh.get(i).getTenKh() + " " + tenkh);
                    return false;
                } else {
                    if (kh.get(i).getNgayHD().equals(ngayhd)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // Kiểm tra rằng đối tượng khách hàng sản xuất đã có trong list chưa, nếu đã có ta lấy loại điện của đối tượng đó
    boolean daCoTrongList(String makh, String tenkh) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).getMaKh().equals(makh) && kh.get(i).getLoai() == 3) {
                if (kh.get(i).getTenKh().equals(tenkh)) {
                    this.loaiDien = kh.get(i).getLoaiDien();
                    return true;
                }
            }
        }
        return false;
    }

    void nhapThongTin() {
        // Biến lựa chọn dùng để xác định xem người dùng muốn nhập đối tượng là kiểu khách hàng nào
        int luaChon;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Khach Hang Sinh Hoat\n2. Khach Hang Kinh Doanh\n3. Khach Hang San Xuat");
        while (true) {
            luaChon = sc.nextInt();

            KhachHang ins_kh;
            switch (luaChon) {
                case 1:
                    ins_kh = new KhachHangSinhHoat();
                    ins_kh.nhapThongTin();
                    break;
                case 2:
                    ins_kh = new KhachHangKinhDoanh();
                    ins_kh.nhapThongTin();
                    break;
                default:
                    ins_kh = new KhachHangSanXuat();
                    ins_kh.nhapThongTin();
                    // Nếu đối tượng là khách hàng sản xuất đã có trong list thì ta set loại điện ta nhập sau đó là loại điện cũ
                    if (daCoTrongList(ins_kh.getMaKh(), ins_kh.getTenKh())) {
                        ins_kh.setLoaiDien(this.loaiDien);
                    }
                    break;
            }
            // Điều kiện bị sai nên ta bỏ qua đối tượng đã nhập đó
            if (!checkDieuKienNhap(ins_kh.getMaKh(), ins_kh.getTenKh(), ins_kh.getNgayHD())) {
                System.out.println("Loi nhap");
                continue;
            }
            // MaKH là rỗng ta dừng vòng lặp
            if (ins_kh.getMaKh().isEmpty()) {
                break;
            }
            kh.add(ins_kh);
        }
    }

    void xuatTheoBai() {
        int nam, thang;
        Scanner sc = new Scanner(System.in);
        thang = sc.nextInt();
        nam = sc.nextInt();
        for (int i = 0; i < kh.size(); i++) {
            // Kiểm tra đối tượng nào có tháng và năm của hóa đơn trùng với ta nhập thì in ra
            if (kh.get(i).getThang() == thang && kh.get(i).getNam() == nam) {
                kh.get(i).xuatHoaDon();
            }
        }
    }
}
