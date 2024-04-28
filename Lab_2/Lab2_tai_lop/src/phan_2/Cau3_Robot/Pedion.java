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

public class Pedion extends robot{
    int F;
    Pedion(){
        Random random= new Random();
        this.M=20;
        this.S=10;
        F = random.nextInt(1,6);
    }
    public void stat(){
        System.out.print("PEDION: \t");
        super.stat();
        System.out.println("\tFlexibility: "+F + "\tNang luong tieu thu: "+Energy());
    }
    public double Energy(){
        return M*S+(F+1)*S/2;
    }

    public int getLoai(){
        return 1;
    }
    
}