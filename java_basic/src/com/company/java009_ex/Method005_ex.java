package com.company.java009_ex;

public class Method005_ex {
	
	public static int add(int x, int y) {return x+y;}
	
	public static int add(byte x, byte y) {return x+y;}
	public static int add(short x, short y) {return x+y;}
	//리턴타입이 달라도 파라미터가 동일하므로 오류
	public static long add(int x, int y) {return x+y;}
	public static long add(long x, long y) {return x+y;}
	
	public static void main(String[] args) {
		//1,2,3,4 에서 오류나는 번호와 이유는?
		// 메서드오버로딩 : 이름이 같고, 파라미터가 다름
	}
	
}
