package com.company.java009_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx006 {

	public static void main(String[] args) {
		String[][] users = {
				{"aaa","111","한국"},
				{"bbb","222","호주"},
				{"ccc","333","중국"}
						};
		
		who_are_you(users);
		who_pass_change(users);
	}

	private static void who_are_you(String[][] users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요>");
		String id = sc.next();
		for(int i=0; i<users.length; i++) {
			if(id.equals(users[i][0])) {
				System.out.println(id +"는 "+users[i][2]+"사람 입니다.");
				break;
			}else {
				System.out.println("다시 실행해주세요.");
			}
		}
	}

	private static void who_pass_change(String[][] users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해 주세요>");
		String id = sc.next();
		System.out.print("비밀번호를 입력해 주세요>");
		String pw = sc.next();
		String result = "유저를 확인해주세요.";
		
		int find = -1;
		for(int ch=0; ch<users.length; ch++) {
			if(id.equals(users[ch][0]) && pw.equals(users[ch][1])) {
				find =ch;
				break;
			}
		}
		if(find != -1) {
			System.out.print("변경하실 비밀번호를 입력해주세요>");
			users[find][1] = sc.next();
			result = Arrays.toString(users[find]);
		}
		
		System.out.println(result);
		
		
//		for(int i=0; i<users.length; i++) {
//			if(id.equals(users[i][0]) && pw.equals(users[i][1])) {
//				System.out.print("변경하실 비밀번호를 입력해주세요>");
//				users[i][1] = sc.next();
//				System.out.println("정보확인 : "+Arrays.toString(users[i]));
//				break;
//			}else {
//				System.out.println("유저를 확인해주세요!");
//				break;
//			}
//		}
		
	}
	
}
