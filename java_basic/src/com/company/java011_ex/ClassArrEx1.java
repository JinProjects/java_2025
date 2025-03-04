package com.company.java011_ex;

public class ClassArrEx1 {

	public static void main(String[] args) {
		Apple[] apples = new Apple[3];
		apples[0] = new Apple("RED","iron",2,1000);
		apples[1] = new Apple("GREEN","hulk",1,1500);
		apples[2] = new Apple("GOLD","captain",3,2000);
		
		for(Apple apple : apples) {
			System.out.println(apple);			
		}
		
//		System.out.println(apples[0].toString());
//		System.out.println(apples[1].toString());
//		System.out.println(apples[2].toString());
	}

}
