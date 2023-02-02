package com.cryxnet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        File csvFile = new File("src/main/resources/test.csv)");
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] values = line.split(csvSplitBy);
                System.out.println("No: " + values[0]);
                System.out.println("Time: " + values[1]);
                System.out.println("Source: " + values[2]);
                System.out.println("Destination: " + values[3]);
                System.out.println("Protocol: " + values[4]);
                System.out.println("Length: " + values[5]);
                System.out.println("Info: " + values[6]);
                System.out.println("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

