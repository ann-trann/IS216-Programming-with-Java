/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cau_4;

/**
 *
 * @author trant
 */
public class QuanBai {
    private String rank;
    private String suit;
    
    QuanBai(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
    
    
}
