/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author 7713b
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class B9_Homework {

    static boolean checkString(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        return str.equals(reverseStr.toString());
    }

    public static void main(String[] args) throws IOException {
        String fileInputUrl = "C:\\Users\\7713b\\OneDrive\\Máy tính\\Java_Project\\JavaProject\\src\\main\\java\\com\\mycompany\\javaproject\\Input1.txt";

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
