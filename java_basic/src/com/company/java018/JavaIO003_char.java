package com.company.java018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JavaIO003_char {

	public static void main(String[] args) {
		//#1. 경로준비
		String folder_rel = "src/com/company/java018/";
		String file_rel = "file003.txt";

		//#2. 폴더 + 파일 만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		try {
			if(folder.exists()) {
				folder.mkdir();
			}
			if(file.exists()) {
				file.createNewFile();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//#3. char쓰기  Reader  > 		[프로그램] > Writer#
		try {
			char[] ch = {'a','b','c'};
			String str = "안녕하세요!!";
			Writer writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(str);
//			writer.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//#4. char읽기  Reader# > 		[프로그램] > Writer
		try {
			int data = 0;
			String str = "";
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			while((str=br.readLine())!=null) {
				System.out.print(str);
			};
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
