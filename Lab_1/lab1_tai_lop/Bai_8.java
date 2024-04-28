/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_tai_lop;

/**
 *
 * @author trant
 */
public class Bai_8 {
    public static void main(String[] args){
        int n = 10;
        System.out.println("x  1  2  3  4  5  6  7  8  9  10");
        for (int i = 1; i <= n; i++){
            if (i == 10){
                System.out.print(i + " ");
            } else {
                System.out.print(i + "  ");
            }
            
            for (int j = 1; j <= n; j++){
                if (i*j < 10){
                    System.out.print(i*j + "  ");
                }
                else{
                    System.out.print(i*j + " ");
                }
            }
            System.out.println();
        }
    }
}
