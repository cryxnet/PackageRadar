package com.cryxnet.Utils;

import com.cryxnet.objects.CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class CSVReader {
    public CSVReader() {}

    /**
     * This method is used to read a CSV file
     * @param filepath path to csv file
     * @return CSV file object
     */
    public CSV read(String filepath) {
        String line = "";
        String csvSplitBy = ",";
        int count = 0;
        CSV csv = new CSV();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((line = br.readLine()) != null) {

                // remove the quote char
                line = line.replace("\"", "");

                // use comma as separator
                String[] values = line.split(csvSplitBy);

                if (count == 0) {
                    csv.setHeader(values);
                } else {
                    csv.addValue(values);
                }

                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return csv;
    }

}

