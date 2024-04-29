/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cau_4;

/**
 *
 * @author trant
 */

import java.util.ArrayList;
import java.util.Collections;

public class BoBai {

    private ArrayList<QuanBai> laBai;
    
    public BoBai(){
        laBai = new ArrayList<>();
        taoLaBai();
    }
    
    private void taoLaBai(){
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"co", "ro", "chuon", "bich"};
        
        for (String suit : suits){
            for (String rank : ranks){
                laBai.add(new QuanBai(rank, suit));
            }
        }
    }
    
    public void shuffle(){
        Collections.shuffle(laBai);
    }
    
    public void chiaBai(){
        shuffle();
        ArrayList<QuanBai> Nhom_1 = new ArrayList<>();
        ArrayList<QuanBai> Nhom_2 = new ArrayList<>();
        ArrayList<QuanBai> Nhom_3 = new ArrayList<>();
        ArrayList<QuanBai> Nhom_4 = new ArrayList<>();
        
        for (int i = 0; i < 52 ; i=i+4){
            Nhom_1.add(laBai.get(i));
            Nhom_2.add(laBai.get(i+1));
            Nhom_3.add(laBai.get(i+2));
            Nhom_4.add(laBai.get(i+3));
        }
        System.out.println("Nhom 1: " + Nhom_1);
        System.out.println("Nhom 2: " + Nhom_2);
        System.out.println("Nhom 3: " + Nhom_3);
        System.out.println("Nhom 4: " + Nhom_4);
    }
    
    
    public static void main(String[] args) {
        BoBai boBai = new BoBai();
        System.out.println(boBai.laBai);
        
        System.out.println("\n----- Xao bai -----");
        boBai.shuffle();
        System.out.println(boBai.laBai);
        
        System.out.println("\n----- Chia bai -----");
        boBai.chiaBai();
    }
}
