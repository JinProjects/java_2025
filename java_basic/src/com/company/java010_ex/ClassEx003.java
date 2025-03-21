package com.company.java010_ex;

class Coffee{
	String name;
	int price;
	int num;
	
	public Coffee() { // 기본생성자 자동생성취소
		this.name = "아메리카노";
		this.price = 2000;
		this.num = 1;
	}
	
	public Coffee(String name, int num, int price) { // 수동작성
		super();
		this.name = name;
		this.num = num;
		this.price = price;
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
	void show() {
		System.out.println("=====커피");
		System.out.println("커피명 : " +this.name);
		System.out.println("커피잔수 : "+this.num);
		System.out.println("커피가격 : "+this.price*this.num);
	}
}
public class ClassEx003 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("카페라떼",2, 4000);
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();
	}

}
