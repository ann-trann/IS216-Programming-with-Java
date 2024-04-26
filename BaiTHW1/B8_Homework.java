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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B8_Homework {
    public static void main(String[] args) throws IOException {
        String fileNameUrl = "C:\\Users\\7713b\\OneDrive\\Máy tính\\Java_Project\\JavaProject\\src\\main\\java\\com\\mycompany\\javaproject\\Input.txt";

        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(fileNameUrl);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            int numRows = Integer.parseInt(line);

            double[][] arr = new double[numRows][12]; 

            // Read data into the array
            for (int t = 0; t < numRows; t++) {
                line = bufferedReader.readLine();
                String[] temp = line.split("\\s+");
                for (int i = 0; i < 12; i++) {
                    arr[t][i] = Double.parseDouble(temp[i]);
                }
            }

            for (int i = 0; i < numRows; i++) {
                Arrays.sort(arr[i]);
            }

            StringBuilder data = new StringBuilder();
            data.append("AVG\tMAX\tMIN\n");
            double SUM = 0;
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < 12; j++){
                    SUM += arr[i][j];
                }
                double AVG = SUM/12;
                AVG = (double)Math.round(AVG * 100) / 100;
                data.append(AVG).append("\t").append(arr[i][11]).append("\t").append(arr[i][0]).append("\n");
                SUM = 0;
            }

            File outputFile = new File("C:\\Users\\7713b\\OneDrive\\Máy tính\\Java_Project\\JavaProject\\src\\main\\java\\com\\mycompany\\javaproject\\Output.txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                bw.write(data.toString());
            }
        } catch (IOException e) {
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
