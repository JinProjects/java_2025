package com.company.java005;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 > ");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++ ) {
			System.out.println(dan+"x"+i+"="+(dan*i));
		}
		
	}

}
