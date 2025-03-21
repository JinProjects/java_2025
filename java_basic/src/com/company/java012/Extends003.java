package com.company.java012;
//1. 클래스는 부품객체
//2. 상태는 멤버변수 + 행위는 멤버함수
//3. 상속 - 클래스 재사용(재활용)   , 오버라이드(@Override) - 부모메서드 나한테 맞게 수정
/*
 * 		Object
 * 		   ↑
 * 		MobileNote7		String iris(private) / void newshow(){} , getter/setter
 * 		   ↑
 * 		MobileNote8		String face(private) / void newshow(){} , getter/setter
 * 		   ↑
 * 		MobileNote9		int battery(private) / void newshow(){} , getter/setter
 * 
 * 
 *  
 * */
class MobileNote7{
	private String iris;
	
	public MobileNote7() {
	}
	
	public String getIris() {
		return iris;
	}

	public void setIris(String iris) {
		this.iris = iris;
	}
	
	void newShow() {
		System.out.println(":::: NOTE7새로운기능(Overriding)");
		System.out.println("= iris 홍채인식기능!");
	}
	
}
class MobileNote8 extends MobileNote7{
	private String face;
	
	public MobileNote8() {
	}
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	@Override
	void newShow() {
		super.newShow();
		System.out.println(":::: NOTE8새로운기능(Overriding)");
		System.out.println("= face 안면인식기능!");
		System.out.println("= face :" + this.getFace());
	}
}

class MobileNote9 extends MobileNote8{
	private int battery = 24;
	
	public MobileNote9() {
	}
	
	//Override 부모 내부에 동일한 메서드명이 있는지 확인해줌
	@Override
	void newShow() {
		super.newShow();
		System.out.println(":::: NOTE9새로운기능(Overriding) 추가");
		System.out.println("= battery 하루종일 사용가능!");
		System.out.println("= battery : "+this.battery);
	}

	
}

public class Extends003 {

	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();
	}

}
