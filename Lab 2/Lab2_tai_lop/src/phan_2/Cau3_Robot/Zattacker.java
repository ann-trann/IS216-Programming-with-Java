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

class Zattacker extends robot{
    int P;
    Zattacker(){
        Random random= new Random();
        this.M=50;
        this.S=10;
        P = random.nextInt(20,31);
    }
    public void stat(){
        System.out.print("ZATTACKER: \t");
        super.stat();
        System.out.println("\tPower: "+P + "\tNang Luong tieu thu: "+Energy());
    }
    public double Energy(){
        return M*S+P*P*S;
    }
    
    public int getLoai(){
        return 2;
    }
    
}
