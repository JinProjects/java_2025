package com.company.java009;

import java.util.Scanner;

public class Method006 {

	public static void main(String[] args) {
		hi();
		hi(1);
		System.out.println(hi("sally"));
	}
	
	public static void hi() {
		System.out.println("hi");
	}
	public static void hi(int i) {
		System.out.println("hi 1 님!");
	}
	public static String hi(String str) {
		return "hi " + str;
	}
}
