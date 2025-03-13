package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_book {

	public static void main(String[] args) {
		String apiurl;
		try {
			apiurl = "https://openapi.naver.com/v1/search/book.json?query="
					+  URLEncoder.encode("자바","UTF-8");
			URL url = new URL(apiurl);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "gxHpau0qEhDoTjs44JIN");
			conn.setRequestProperty("X-Naver-Client-Secret", "yhyAYjwZNl");
			
			int code = conn.getResponseCode();
			BufferedReader br;
			if(code == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			String line = "";
			StringBuffer sb = new StringBuffer();
			while((line=br.readLine())!=null) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
