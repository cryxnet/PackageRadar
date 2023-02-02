package com.cryxnet.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class API {
    public API() {}

    /**
     * This method is used to get information about an ip address
     * @param ipaddr
     * @return json object of the api call
     * @throws IOException
     */
    public String getIPInformation(String ipaddr) throws IOException {
        String baseURI = "https://ipapi.co/IP_ADDRESS/json";
        URL modifiedURI = new URL(baseURI.replace("IP_ADDRESS", ipaddr));

        HttpURLConnection con = (HttpURLConnection) modifiedURI.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        try {
            // Wait for the cooldown time
            Thread.sleep(1000);  // 1 second cooldown time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}