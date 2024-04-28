/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau3_Robot;

/**
 *
 * @author trant
 */

import java.util.Random;

public class Carrier extends robot{
    int E;
    Carrier(){
        Random random= new Random();
        this.M=30;
        this.S=10;
        E = random.nextInt(50,101);
    }
    public void stat(){
        System.out.print("CARRIER: \t");
        super.stat();
        System.out.println("\tEnergy: "+E + "\tNang luong tieu thu: "+Energy());
    }
    public double Energy(){
        E = M*S+4*E*S;
        return E;
    }

    public int getLoai(){
        return 3;
    }
}
