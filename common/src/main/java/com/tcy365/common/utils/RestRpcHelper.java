package com.tcy365.common.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestRpcHelper {
    public static String getMethod(String url) throws IOException {
        URL restURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        conn.setRequestMethod("GET"); // POST GET PUT DELETE
        conn.setRequestProperty("Accept", "application/json");
        return getString(conn);
    }

    private static String getString(HttpURLConnection conn) throws IOException {
        InputStream inputStream= conn.getInputStream();
        InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
        br.close();
        return result.toString();
    }

    public static String postMethod(String url, String body) throws IOException {
        URL restURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        PrintStream ps = new PrintStream(conn.getOutputStream());
        ps.print(body);
        ps.close();
        return getString(conn);
    }
}
