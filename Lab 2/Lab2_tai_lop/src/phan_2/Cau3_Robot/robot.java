/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_2.Cau3_Robot;


/**
 *
 * @author trant
 */
public abstract class robot{
    int M;
    int S;
    int E;
    public void stat(){
        System.out.print("Weight: "+M);
    }
    public abstract double Energy();
    
    public abstract int getLoai();
    
    
}


