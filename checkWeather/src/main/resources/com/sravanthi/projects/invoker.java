/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sbitrakanti
 */
package com.sravanthi.projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


public class invoker {
    static String out=null;
    public static String processRequest(String zip) throws ProtocolException, IOException {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zip + ",us";    
        String output;
        out="";
        try {
            URL u = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));                
                System.out.println("Output from Server .... \n"); 
                
                while ((output=br.readLine()) != null) {
                    out+=output;
                    System.out.println(output);
                }                
                
            }
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } 
     return out;   
    }
}
