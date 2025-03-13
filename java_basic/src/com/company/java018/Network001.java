package com.company.java018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Network001 {

	public static void main(String[] args) {
		try {
			//1. URL
			URL url = new URL("https://google.com/");
			//2. 연결객체 ( HttpURLConnection)
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//3. 요청설정
			conn.setRequestMethod("GET");
			conn.setDoInput(true);//던지는거 읽어들임
			conn.setDoOutput(true);//읽은거 출력
			conn.setReadTimeout(1000);// 1000 = 1초
			//4. 응답코드 - 200
			//응답코드 200 확인 200 - 읽어서 오는 것 성공 (응답 성공)
			System.out.println(conn.getResponseCode());
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
			};
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
			//5. 응답데이터 #
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
