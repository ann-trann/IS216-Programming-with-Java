/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ve_nha;

/**
 *
 * @author 7713b
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Bai_9 {
    static boolean checkString(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return str.equals(reverseStr.toString());
    }

    public static void main(String[] args) throws IOException {
        String fileInputUrl = "D:\\java_exercise\\lab 1\\Lab1_ve_nha\\src\\lab1_ve_nha\\input1.txt";

        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(fileInputUrl);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            int numberOfLine = 1;
            String line = bufferedReader.readLine();
            while (line != null){
                if (checkString(line)){
                    System.out.println("Hang " + numberOfLine + " la chuoi palindrome");
                }
                line = bufferedReader.readLine();
                numberOfLine++;
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
