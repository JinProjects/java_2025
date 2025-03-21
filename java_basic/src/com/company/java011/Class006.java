package com.company.java011;
/***
 * (1) runtime data area
 * -----------------------------------
 * [method : 정보, 공유] A.class / Class006.class / company[], main  ##1.
 * -----------------------------------
 * [heap:동적] 			| [stack:임시]
 * 							a2.method(){ int a=3000; System.out.println(a); }
 * 2번지{a=7}			←	a2 2번지
 * 1번지{a=3}			←	a1 1번지
 * 						| main ##2.
 * -----------------------------------
 * 
 * (2) 초기화
 * 				     기본값		명시적초기화		초기화블록				생성자
 * 클래스변수 company   1.null      2.(주)동물농장	3.(주) 동물농장-joy	X	
 * 인스턴스변수     a	  4. 0		  5. 10			6. 100				7. 3
 */

class A{
	//멤버변수
	int a = 10; //인스턴스변수 - heap - new () - this 각각 
	{a = 100;}
	static String company = "(주)동물농장"; //명시적초기화
	static { company = "(주) 동물농장-joy";}
	// 클래스변수 - method - new X - 공유
	//멤버함수
	void method() { 
		//지역변수 stack영역 - 초기화를 해야함
		int a = 3;
		System.out.println(this.a); //인스턴변수
	}
	void show() {System.out.println();}
	
	public A() {
		// TODO Auto-generated constructor stub
	}
	A(int a){ this.a = a;}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
	
}

public class Class006 {

	public static void main(String[] args) {
		// 클래스변수
		System.out.println(A.company);
		// 인스턴스변수
		A a1 = new A(3); System.out.println(a1);
		A a2 = new A(7); System.out.println(a2);
	}

}