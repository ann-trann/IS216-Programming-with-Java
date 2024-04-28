/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ve_nha;

/**
 *
 * @author trant
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class Bai_8 {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("D:\\java_exercise\\lab 1\\Lab1_ve_nha\\src\\lab1_ve_nha\\input.txt"));
            
            int numDays = sc.nextInt();
            sc.nextLine();
            
            PrintWriter writer = new PrintWriter("D:\\java_exercise\\lab 1\\Lab1_ve_nha\\src\\lab1_ve_nha\\output.txt");
            
            for (int i = 0; i < numDays; i++){
                double[] NhietDo = new double[12];
                for (int j = 0; j < 12; j++){
                    NhietDo[j] = sc.nextDouble();
                }
                
                double sum = 0;
                double Max = NhietDo[0];
                double Min = NhietDo[0];
                for (double nhietDo : NhietDo) {
                    sum += nhietDo;
                    Max = Math.max(Max, nhietDo);
                    Min = Math.min(Min, nhietDo);
                }
                double nhietDoTB = sum / 12; 
                writer.write(String.format("Ngay %d: Nhiet do trung binh=%.2f, Nhiet do cao nhat=%.2f, Nhiet do thap nhat=%.2f\n",
                            i + 1, nhietDoTB, Max, Min));                          
            }
            writer.close();
            sc.close();
            System.out.println("Da viet vao file output.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Loi khi viet vap file.");
            e.printStackTrace();
        }
    }
}
