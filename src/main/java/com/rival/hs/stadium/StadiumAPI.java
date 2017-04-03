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


    StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/pblfclt-opn-info-std"); /*URL*/
    StringBuilder sb;
    public String send(int i) {

        try {
            urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/pblfclt-opn-info-std"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8")+"=78f2%2F0BGJJcNU0CYr6MlN348wkr1cW2yzN5s9Te5SVOdw9YuILlj%2BGt4cGrptcbMx%2BfPaNH2EMjhqacLCy9p7Q%3D%3D");
            urlBuilder.append("&" + URLEncoder.encode("s_page","UTF-8") + "=" + URLEncoder.encode(String.valueOf(i), "UTF-8")); /*파라미터설명*/
            urlBuilder.append("&" + URLEncoder.encode("s_list","UTF-8") + "=" + URLEncoder.encode("999", "UTF-8")); /*파라미터설명*/
            //urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*파라미터설명*/


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
            sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            //System.out.println(sb.toString());
            System.out.println(urlBuilder.toString());

        }
        catch (Exception e) {


        }
        return sb.toString();
    }
}