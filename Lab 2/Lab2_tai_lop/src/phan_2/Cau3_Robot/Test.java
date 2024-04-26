/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau3_Robot;

/**
 *
 * @author trant
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong robot Pedion: ");
        int A = sc.nextInt();
        System.out.print("Nhap so luong robot Zattacker: ");
        int B = sc.nextInt();
        System.out.print("Nhap so luong robot Carrier: ");
        int C = sc.nextInt();
        
        int n = A+B+C;
        robot[] robots = new robot[n];
        for (int i=0; i < A; i++){      robots[i] = new Pedion();       }
        for (int i=A; i < A+B; i++){    robots[i] = new Zattacker();    }
        for (int i=A+B; i < n; i++){    robots[i] = new Carrier();      }
        
        System.out.println("=============== DANH SACH ROBOT ===============");
        for (int i = 0; i < n; i++){
            robots[i].stat();
        }
        
        int tongPedion = 0;
        int tongZattacker = 0;
        int tongCarrier = 0;
        for (int i = 0; i < n; i++){
            switch(robots[i].getLoai()){
                case 1:
                    tongPedion += robots[i].Energy();
                    break;
                case 2:
                    tongZattacker += robots[i].Energy();
                    break;
                case 3:
                    tongCarrier += robots[i].Energy();
                    break;
            }
        }

        System.out.println("====== Tong nang luong tieu thu =========");
        System.out.println("Pedion: "+tongPedion);
        System.out.println("Zattacker: "+tongZattacker);
        System.out.println("Carrier: "+tongCarrier);

        System.out.print("==== Loai robot co tong nang luong tieu thu cao nhat: ");
        if (tongPedion > tongZattacker && tongPedion > tongCarrier){
            System.out.println("Pedion");
        } else if (tongZattacker > tongCarrier){
            System.out.println("Zattacker");
        } else {
            System.out.println("Carrier");
        }
        
    }
    
}
