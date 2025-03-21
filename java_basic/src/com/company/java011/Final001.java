package com.company.java011;

import com.company.java011_ex.FinalEx;

//1. Object - 자바팀이 객체를 만들어놓음 
//2. extends 상속(앞에 객체 그대로 사용)
//4. final class FinalEx extends Object{ 상속안됨
class FinalEx1 extends Object{ 
	//static String tree = 
	static final String tree = "4-5"; //식목일 - 나무심는날 기념일
	String name;
	final void show() {System.out.println(FinalEx.tree + "/" + name);}
	
	
}

class MyDate extends FinalEx1{
	//5.오버라이드 자식클래스에서 메서드재수정
	@Override
	void show() {
		super.show();
	}
}


public class Final001 {

	public static void main(String[] args) {
		//FinalEx.tree = "4-6"; //3-2. static 공용  아래에서 변경가능
								//3-3. final 값 변경이 안됨 - cannot be assigned
		System.out.println("식목일 - 나무심는 날, 기념일(공유, 변경안되는 값) > " + FinalEx.tree);
	}

}
