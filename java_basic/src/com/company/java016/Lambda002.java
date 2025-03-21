package com.company.java016;

interface InterA2{  void hi1();}    
interface InterB2{  void hi2(String name);}  
interface InterC2{  String hi3();}   
interface InterD2{  String hi4(int num, String name);}  

public class Lambda002 {

	public static void main(String[] args) {

		InterA2 a1 = () -> System.out.println("hi");
		a1.hi1();
		
		InterB2 a2 = name -> System.out.println("hi"+name);
		a2.hi2("sally!");
		
		InterC2 a3 = () -> "Hello!!";
		System.out.println(a3.hi3());
		
		InterD2 a4 = new InterD2() {
			public String hi4(int num, String name) {
				return num + name;		
			};
		};
		System.out.println(a4.hi4(3, "yj"));
		
		 a4 = (num,name) -> num + name;
		System.out.println(a4.hi4(3, "yj"));
	}

}
