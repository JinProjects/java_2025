package com.company.java009_ex;

import java.util.Arrays;

public class MethodEx005 {

	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		upper(ch);
		System.out.println("main. 배열값 : " + Arrays.toString(ch));
	}
	public static void upper(char[] ch) {
		for(int i= 0; i<ch.length; i++) {
			ch[i] -= 32;
		}
	}
	
}
