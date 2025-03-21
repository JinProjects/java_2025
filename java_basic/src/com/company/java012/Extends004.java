package com.company.java012;
//1. 클래스는 부품객체
//2. 상태는 멤버변수 + 행위는 멤버함수
//3. 상속 - 클래스 재사용(재활용)   , 오버라이드(@Override) - 부모메서드 나한테 맞게 수정
/*
* 					Object
*	 	↑								↑
*    Grand( one(), two() )			Aunt( name, toString() )
*    ↑         ↑
*  Father     Uncle
*  (three())  (four()/one(),two())
*   
*  
*/
class Grand extends Object{
	public Grand() {
		// TODO Auto-generated constructor stub
	}
	public void one() {
		System.out.println("grand : one");
	}
	public void two() {
		System.out.println("grand : two");
	}
}
class Father extends Grand{
	public Father() {
		// TODO Auto-generated constructor stub
	}
	public void three() {
		System.out.println("father : three");
	}
}
class Uncle extends Grand{
	
	public Uncle() {
		// TODO Auto-generated constructor stub
	}
	public void four() {
		System.out.println("uncle : four");
	}
	@Override
	public void one() {
		super.one();
		System.out.println("uncle : one");
	}
	@Override
	public void two() {
		super.two();
		System.out.println("uncle : two");
	}
}
class Aunt extends Object{
	String name = "MiMi";
	public Aunt() {
	}
	@Override
	public String toString() {
		
		return name + "옆집이모클래스";
	}
}
public class Extends004 {

	public static void main(String[] args) {
		Father father = new Father();
		father.three();
		father.two();
		father.one();
		
		Uncle uncle = new Uncle();
		uncle.four();
		uncle.two();
		uncle.one();
		
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString());
		System.out.println(aunt);
	}

}
