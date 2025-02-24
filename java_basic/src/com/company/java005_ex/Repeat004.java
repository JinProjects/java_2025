package com.company.java005_ex;

import java.util.Scanner;

public class Repeat004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("숫자를 입력해주세요>");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("종료");
				break;
			}
		}
		
}

}
