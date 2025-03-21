package com.company.java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class JavaIO005_buffered {

	public static void main(String[] args) {
		//#1. 경로만들기
		String folder_rel = "src/com/company/java018/";
		String file_rel = "file005.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		//#2. 폴더 + 파일 만들기
		try {
			if(!folder.exists()) {
				folder.mkdir();
			}
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//#3. 파일쓰기(byte)
		/*	1) ## 읽어들이는 Stream InputStream > [프로그램] > ## 쓰는 Stream  OutputStrem
		 *   BufferedWriter(속도향상) - OutputStreamWriter(단어) - FileOutputStream(byte)
		 *	2) ## 읽어들이는 Stream / ## 쓰는 Stream 누구인지 체크?
		 *          InputStream			OutputStrem
		 *          Reader				Writer
		 *          
		 * 1 white 1200
		 * 2 choco 1500
		 * 3 banana 1800
		 * 
		 * */
		
		try {
			String[] str = new String[3];
			Scanner sc = new Scanner(System.in);
			
			System.out.print("번호입력 >");
			str[0] = sc.next();
			System.out.print("이름입력 >");
			str[1] = sc.next();
			System.out.print("가격입력 >");
			str[2] = sc.next();
			
			FileOutputStream os = new FileOutputStream(file);
			
			Writer wr = new FileWriter(file,true);
//			BufferedWriter bw = new BufferedWriter(wr);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			for(int i=0; i<str.length; i++) {
				bw.write(str[i]);
				bw.append(" ");
			}
			bw.append("\r");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			//oos.writeObject(oos);
			
			bw.flush();
			bw.close();
			wr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//#4. 파일읽기(byte)
		//1) ## InputStream > [프로그램] > OutputStrem
		// BufferedReader(속도향상) - InputStreamReader(단어) - FileInputStream(byte)
		Reader re;
		try {
			re = new FileReader(file);
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String str = ""; 
			//주소값을 바꾸지 않음
			StringBuffer sb = new StringBuffer();
			while((str=br.readLine())!= null) {
				sb.append(str + "\n");
			};
			System.out.println(sb.toString());
			br.close();
			re.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
