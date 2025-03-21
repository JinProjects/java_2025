package com.company.java015;

class A1 extends Object{
	int a;
	public A1() {
		// TODO Auto-generated constructor stub
	}
	public A1(int a) {
		super();
		this.a = a;
	}
	
}

class B1 extends A1{
	int b;
	public B1() {
		// TODO Auto-generated constructor stub
	}
	public B1(int b) {
		super();
		this.b = b;
	}
	public B1(int a, int b) {
		super(a);
		this.b = b;
	}
}
class C1 extends B1{
	int c;
	
	public void show() {
		System.out.println("상속받은 A클래스의 a : " + a);
		System.out.println("상속받은 B클래스의 b : " + b);
		System.out.println("상속받은 C클래스의 c : " + c);
	}
}
public class Extends {

	public static void main(String[] args) {
		//q1. 부모의 클래스를 상속받아 자식의 타입으로 재정의하여 사용하기 위함
		//q2. 자식클래스는 부모클래스를 상속받는다.
		//q3. ##1 extends Object
		//	  ##2 extends A1
		//	  ##3 extends B1
		// 출력결과 : 10 20 20
		
		C1 myc = new C1();
		myc.a = 10; 
		myc.b = 20;
		myc.c = 20;
		myc.show();
		
	}

}
