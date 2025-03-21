package com.company.java015;

//q1
public class Coffee012 {
	String name;
	int price;
	int num;
	
	public Coffee012() {
		this.name = "아메리카노";
		this.price = 1500;
		this.num = 1;
	}
	
	public Coffee012(String name, int num, int price) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}


	void show() {
		System.out.println("커피이름 : " + this.name);
		System.out.println("커피잔수 : " + this.num);
		System.out.println("커피가격 : " + this.price*this.num);
	};
	
	
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("카페라떼", 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
		
	}
	

}


/**************
Repeat001.java                   <  javac Repeat001.java
Coffee.class , Repeat001.class   <  java  Repeat001 
------------------------------------------------------------
[method : 정보보관]
[1번지]Coffee.class  
[2번지]Repeat001.class  ##1
------------------------------------------------------------
[heap : 동적]                    |       [stack : 지역+]
[2000]번지                         <----[a2 | 2000번지]
{ name="아메리카노", num=1 , price=1500 }                                   
[1000]번지                         <----[a1 | 1000번지]
{  name="까페라떼", num=2, price=4000  }   [main          ]
------------------------------------------------------------
*/
