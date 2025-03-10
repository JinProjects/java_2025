package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.print("숫자를 입력해주세요 >");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.println(list.get(num-1));
//		}
//		if(num == 2) {
//			System.out.println(list.get(num-1));
//		}
//		if(num == 3) {
//			System.out.println(list.get(num-1));
//		}
//		
//		for(int i=1; i<=list.size(); i++) {
//			if(num == i) {
//				System.out.println(list.get(i-1));
//				break;
//			}
//		}
		System.out.println(list.get(num-1));
	}

}
