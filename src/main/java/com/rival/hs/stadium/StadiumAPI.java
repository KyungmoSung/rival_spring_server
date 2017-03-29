package com.rival.hs.stadium;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Minwoo on 2017. 3. 29..
 */
public class StadiumAPI {


    StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/c84c0583-a4b0-40f5-ab20-91d240efec0f"); /*URL*/




    public void send() {

        try {
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=78f2%2F0BGJJcNU0CYr6MlN348wkr1cW2yzN5s9Te5SVOdw9YuILlj%2BGt4cGrptcbMx%2BfPaNH2EMjhqacLCy9p7Q%3D%3D"); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("파라미터영문명","UTF-8") + "=" + URLEncoder.encode("파라미터기본값", "UTF-8")); /*파라미터설명*/

            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
            System.out.println(urlBuilder.toString());

        }
        catch (Exception e) {


        }
    }
    public static void main(String[] args) {

            StadiumAPI test = new StadiumAPI();
            test.send();
    }

}


