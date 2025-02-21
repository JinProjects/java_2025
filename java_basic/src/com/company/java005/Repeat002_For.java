package com.company.java005;

import java.util.Scanner;

public class Repeat002_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a = 1;
			if(a==1) {
				break;				
			}else if(a==2) {
				
			}else if(a==3) {
				
			}else if(a==4) {
				
			}else if(a==5) {
				
			}else if(a==9) {
				
			}
			
			//a가 1이라면 나가기 #2. 나갈조건
		}
		
		//for - break
		//1 2 - 3 뒤로 없어짐 break;
		for(int i=1; i<=10; i++) {
			if(i==3) {
				break;
			}
			System.out.print(i+"\t");
		}
		//for - continue - skip
		//1 2 (3) 4 5 6 7 8 9 10
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i + "\t");
		}
		
		///// 메뉴판만들기
		//RepeatEx006
		for(;;) {
			int a = sc.nextInt();
			if(a==1) {
				break;				
			}else if(a==2) {
				
			}else if(a==3) {
				
			}else if(a==4) {
				
			}else if(a==5) {
				
			}else if(a==9) {
				
			}
			
		}
	}

}
