package com.company.java016;

class RefClass{
	void method(String str) {System.out.println(str);}
}
interface InterUsing{ void inter(RefClass c, String str); }
public class Lambda003_ref {

	public static void main(String[] args) {
		//#1. 익명클래스
			InterUsing inter1 = new InterUsing() {
				@Override
				public void inter(RefClass c, String str) { // RefClass c = 
					c.method(str);
				}
			};
			inter1.inter(new RefClass(), "Hello");
		//#2. 람다 () -> {}
			InterUsing inter2 = (c,str) -> c.method(str);
			inter2.inter(new RefClass(), "Hi");
		//#3 :: 표현식 (참조)
			InterUsing inter3 = RefClass::method;
			inter3.inter(new RefClass(), "hi");
		//#4 interface InterBasic {int method(int a, int b);}
			//						리턴값		파라미터
			InterBasic basic = (a, b) -> Math.max(a, b);
			System.out.println(basic.method(10, 3));
			InterBasic basic2 = Math::max;
			basic2.method(10, 3);
			
			InterEx1 basic3 = str -> str.length();
			System.out.println(basic3.method("ABC"));
			
			InterEx1 basic4 = String::length;
			System.out.println(basic4.method("12345"));
			
			InterEx2 basic5 = num -> System.out.println(num);
			basic5.method(5);
			
			InterEx2 basic6 = System.out::println;
			basic6.method(6);
	}	

}

interface InterBasic{
	int method(int a, int b);
}
interface InterEx1{
	int method(String str);
}
interface InterEx2{
	void method(int num);
}