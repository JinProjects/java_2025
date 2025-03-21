package com.company.java009_ex;

import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class MyPrice001{
	String name;
	int price;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품이름 입력>");
		this.name = sc.next();
		System.out.print("상품가격 입력>");
		this.price = sc.nextInt();
	}
	void show() {
		System.out.println("상품정보입니다.");
		System.out.println("상품이름 : "+this.name + " / 상품가격 : "+this.price);
	}
}
public class ClassEx002 {
	public static void main(String[] args) {
		MyPrice001 p1 = new MyPrice001();
		//3-1) new 공간빌리기, 
		//객체생성 3-2) MyPrice001()
		//초기화 3-3) p1 주소
		p1.input();
		p1.show();
	}

}
/* 클래스(설계도) - 인스턴스화(실제객체) - 객체(인스턴스들......)/인스턴스 p1.name
 * ------------------------------------[runtime data area]
 * [method: 정보, static, final:공용정보] MyPrice001.class / ClassEx002.class 
 * ------------------------------------------------------------------------
 * [heap:동적]						|[stack:잠깐빌리기]
 * 29번째 : 							p1.show(); 1번지.show();{}
 * 28번째 : {name=apple, price=1000} p1.input(); 1번지.input(); {}
 * 23번째: {name, price}			←	p1 : 1번지
 * 									|main
 * ------------------------------------------------------------------------
 * */
