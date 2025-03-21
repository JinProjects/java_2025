package com.company.java010_ex;

// 1. 클래스는 부품객체
// 2. 상태와 행위
class Card{
	String channel;
	String volume;
	int cardNum;
	boolean isMembership;
	
	//card(){} 사용자가 직접 생성하지 않으면 컴파일러가 자동생성
//	public Card() {
//		this.channel = "JDBC";
//		this.volume = "5";
//		this.cardNum = 0;
//		this.isMembership = false;
//	}
	
	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
	//1. Card() : 생성자 오버로딩시 컴파일러가 기본생성자 자동생성취소
	//2. Card() : 기본생성자 기본셋팅 - cardNum=1; 멤버쉽 = true;
	public Card() { 
		super();
		this.cardNum = 1;
		this.isMembership = true;
	}

	void input() {
		
	}
	void show() {
		
	}

	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	
}
public class ClassEx005 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);
		
		Card c2 = new Card(3,false);
		System.out.println(c2);
	}

}
