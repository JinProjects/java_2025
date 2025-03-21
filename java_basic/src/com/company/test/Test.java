package com.company.test;

public class Test {
	public static void main(String[] args) {
		String str = "사과,바나나,딸기";
		System.out.println(str.split(",")[0]);
	}
	String name;
	int age;
	 void show() {
		System.out.println("::::::::::: static + final");
		System.out.println(":: 이름 : "  + this.name );
		System.out.println(":: 나이 : "  + this.age  );
	}
}
