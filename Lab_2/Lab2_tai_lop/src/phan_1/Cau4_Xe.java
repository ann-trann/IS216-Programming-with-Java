/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_1;

import java.util.ArrayList;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Cau4_Xe {
    public static class Xe{
        private String tenChuXe;
        private String loaiXe;
        private int triGia;
        private int dungTich;
        private int Thue=0;
        
        public Xe(){}
        public Xe(String tenChuXe, String loaiXe, int triGia, int dungTich) {
            this.tenChuXe = tenChuXe;
            this.loaiXe = loaiXe;
            this.triGia = triGia;
            this.dungTich = dungTich;
            int phanTram;
            if (dungTich < 100) phanTram = 1;
            else if (100<=dungTich && dungTich<=175) phanTram = 3;
            else phanTram = 5;
            this.Thue = triGia * phanTram / 100;
        }
        
        String getTenChuXe(){
            return this.tenChuXe;
        }
        String getLoaiXe(){
            return this.loaiXe;
        }
        int getTriGia(){
            return this.triGia;
        }
        int getDungTich(){
            return this.dungTich;
        }
        int getThue(){
            return this.Thue;
        }
        
        void setTenChuXe(String ten){
            this.tenChuXe = ten;
        }
        void setLoaiXe(String loai){
            this.loaiXe = loai;
        }
        void setTriGia(int triGia){
            this.triGia = triGia;
        }
        void setDungTich(int dungTich){
            this.dungTich = dungTich;
            int phanTram;
            if (dungTich < 100) phanTram = 1;
            else if (100<=dungTich && dungTich<=175) phanTram = 3;
            else phanTram = 5;
            this.Thue = triGia * phanTram / 100;
        }
        
        // Nhập danh sách xe vào một mảng, việc nhập kết thúc khi ta nhập tên chủ xe bằng rỗng. 
        public static void nhapDanhSachXe(ArrayList<Xe> dsXe){
            int i = 1;
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Nhap thong tin xe thu " + i + ": ");
                System.out.print(" - Nhap ten chu xe: ");
                String ten = sc.nextLine();
                if (ten.equals("")) break;
                Xe xe = new Xe();
                xe.setTenChuXe(ten);
                System.out.print(" - Nhap loai xe: ");
                String loai = sc.nextLine();
                xe.setLoaiXe(loai);
                System.out.print(" - Nhap tri gia xe: ");
                int triGia = sc.nextInt();
                xe.setTriGia(triGia);
                System.out.print(" - Nhap dung tich: ");
                int dungTich = sc.nextInt();
                sc.nextLine();
                xe.setDungTich(dungTich);
                dsXe.add(xe);
                i++;
            }
        }
        
        // Xuất bảng kê khai tiền thuế phải đóng của các xe trong danh sách. Thông tin xuất 
        //bao gồm: tên chủ xe, loại xe, trị giá xe, dung tích xylanh của xe, thuế phải đóng. 
        public static void xuatBangKeKhaiThue(ArrayList<Xe> dsXe){
            System.out.println("-------------- BANG KE KHAI THUE ---------------- ");
            int n = dsXe.size();
            for (int i = 0; i < n; i++) {
                System.out.println("Chu xe: "+dsXe.get(i).getTenChuXe()
                        +"\t\tLoai xe: "+dsXe.get(i).getLoaiXe()
                        +"\t\tTri gia: "+dsXe.get(i).getTriGia()
                        +"\t\tDung tich: "+dsXe.get(i).getDungTich()
                        +"\t\tThue: "+dsXe.get(i).getThue());
            }
        }
        
        // Nhập tên chủ xe và loại xe vào, xuất hiện thuế phải đóng của chủ xe
        public static void timTheoTenvaLoaiXe(ArrayList<Xe> dsXe, String ten, String loaiXe){
            int n = dsXe.size();
            for (int i = 0; i < n; i++){
                if (dsXe.get(i).getTenChuXe().equals(ten) && dsXe.get(i).getLoaiXe().equals(loaiXe)){
                    
                    System.out.println("Thue phai dong: "+dsXe.get(i).getThue());
                }
            }
        }
        
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            ArrayList<Xe> dsXe = new ArrayList<>();
            nhapDanhSachXe(dsXe);
            xuatBangKeKhaiThue(dsXe);
            System.out.println("---------- NHAP TEN VA LOAI XE, XUAT THUE PHAI DONG: ");
            System.out.print(" - Nhap ten: ");
            String ten = sc.nextLine();
            System.out.print(" - Nhap loai xe: ");
            String loaiXe = sc.nextLine();
            timTheoTenvaLoaiXe(dsXe, ten, loaiXe);
        }

    }
    
}
