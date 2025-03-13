package com.company.java018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIO004_img {

	public static void main(String[] args) throws Exception {
		//#1. 경로
		String origin = "src/com/company/java018/힐링.jpg";
		String target1 = "src/com/company/java018/힐링1.jpg";
		String target2 = "src/com/company/java018/힐링2.jpg";
		
		
		//#2. byte 단위로 이미지파일 읽어들여서 쓰기(모든 형식:문자, 이미지, 영상 )
		// ma.jpg → ma1.jpg
		// InputStream (읽기) > [Program] > OutputStream (쓰기)
		InputStream bis = new FileInputStream(origin);  //ma.jpg
		OutputStream bos = new FileOutputStream(target1);//ma1.jpg
		
		int cnt1 = 0;
		while((cnt1=bis.read())!=-1) {
			bos.write(cnt1);
		}
		bos.flush();
		bos.close();
		bis.close();
		System.out.println(">> byte 이미지 복사완료");
		//#3. char 단위로 이미지파일 읽어들여서 쓰기(문자만)
		//문자전용이라 이미지파일을 복사하려 하지만 안됨..
		// ma.jpg → ma2.jpg
		//Reader(읽기) > [Program] > Writer (쓰기)
		Reader cr = new FileReader(origin);  //ma.jpg
		Writer cw = new FileWriter(target2); //ma2.jpg
		
		int cnt2 = 0;
		while((cnt2=cr.read())!=-1) {
			cw.write((char)cnt2);
		}
		cw.flush();
		cw.close();
		cr.close();
		System.out.println(">> char 이미지 복사완료");
		
	}

}
