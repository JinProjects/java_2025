package com.company.java010_ex;


//클래스는 부품객체
//상태와 행위
class Sawon3{
// 상태(멤버변수)
	int pay = 10000;//인스턴스변수 - heap - new () - this, 생성자
	static int su = 10;//클래스변수 - method - X - 공유하는 목적 
	//클래스변수는 인스턴스 변수를 담을 수 없다.
	//클래스변수 = 인스턴스변수 ( 클래스변수, 클래스메서드 - this, 인스턴스사용불가)
	//메모리에 먼저 등록이 되어 사용할 수 없음
	static int basicpay = pay; 
	static int basicpay2;//클래스변수
	
//행위(멤버함수) - 클래스함수 / 인스턴스함수
	//클래스메서드
	public static void showSu() {
		System.out.println(su);
	}
	//클래스메서드
	public static void showPay() {
		//static영역에 인스턴스변수를 사용할 수 없다.
		System.out.println(this.pay);
	}
	//인스턴스메서드
	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	//클래스메서드
	public static void showAll002() {//X 클래스함수 - method - new X - 공유
		showAll001(); //인스턴스 사용불가 - heap - new() - this, 생성자 
		System.out.println(this.pay);
	}
}
public class StaticEx003 {
	
	public static void main(String[] args) {
		//지역변수
		Sawon3 sola = new Sawon3();
		sola.showAll001();
	}

}
