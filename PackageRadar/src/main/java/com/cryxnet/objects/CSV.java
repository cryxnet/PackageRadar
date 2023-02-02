package com.cryxnet.objects;

import java.util.ArrayList;

public class CSV {
    private String[] header ;
    private ArrayList<String[]> values = new ArrayList<>();

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public ArrayList<String[]> getValues() {
        return values;
    }

    public void setValues(ArrayList<String[]> values) {
        this.values = values;
    }

    public void addValue(String[] values) {
        this.values.add(values);
    }
}
