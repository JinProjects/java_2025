package com.company.java018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO002 {

	public static void main(String[] args) {
		//#1. 경로
		String folder_rel = "src/com/company/java018/";
		String file_rel = "file002.txt";
		//#2. 파일 + 폴더만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		try {
			if(!folder.exists()) {
				folder.mkdir();
			}
			if(!file.exists()) {
				file.createNewFile();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//#3. byte 파일 쓰기
		try {
			byte[] arr = {'b','b','c'};
//			byte[] arr = "text".getBytes();
			
			//FileOutputStream 
			OutputStream os = new FileOutputStream(file);
			os.write(arr);				
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//#4. byte 파일 읽기
		try {
			InputStream io = new FileInputStream(file);
			int data = 0;
			while((data = io.read())!=-1) {
				System.out.print((char)data);
			}
			io.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
