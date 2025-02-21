package com.company.java005_ex;

import java.util.Scanner;

public class RepeatEx006_menu {

	public static void main(String[] args) {
		int num=1;
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("메뉴판입니다 9. 종료");
			num = sc.nextInt();
			if(num == 1) {
				
			}else if(num == 2) {
			}else if(num == 3) {
			}else if(num == 4) {
			}else if(num == 5) {
			}else if(num == 9) {
				System.exit(0);
			}
		}
	}

}
