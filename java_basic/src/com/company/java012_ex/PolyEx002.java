package com.company.java012_ex;

class Parent7 extends Object{
	int x = 100;
	public Parent7() {
		super();
	}
	void method() {
		System.out.println("Child");
	}
}
class Child7 extends Parent7{
	int x = 200;
	public Child7() {
		super();
	}
	@Override
	void method() {
		System.out.println("Child Method");
	}
}
public class PolyEx002 {

	public static void main(String[] args) {
		Parent7 p = new Child7();
		//p 1번지 {x = 200 / method() "Child Method"} - { x = 100 / ------ }
		 
		Child7 c = new Child7();
		//p 1번지 {x = 200 / method() "Child Method"}
		System.out.println("p.x = " + p.x);//100
		p.method();//"Child Method"
		System.out.println("c.x = " +c.x ); //200
		c.method();//"Child Method"
		//c.x를 이용해 부모의 x꺼내오기
		
		System.out.println(((Parent7)c).x);
	}

}
