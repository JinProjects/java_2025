package com.company.java008_ex;

public class MethodEx004 {

	public static void main(String[] args) {
		System.out.println("1. 내가 좋아하는 숫자 :" + return_num());
		System.out.println("2. 10/3.0을 실수로 표현:" + return_float());
		System.out.println("3. BEST COLOR	:" +mycolor());
		System.out.println("4. 장수돌침대 별이	:" +jangsu());
		System.out.println("5. 10+20=" +myadd(10,20));
		System.out.println("6. 반(노랑조/주황조)=" +myban('B'));
		System.out.println("7. 당신의 학번은?" +stdld(1111));
		System.out.println("8. 당신의 평균은?" +stdAvg(88));
		//90점 이상 A 80점 이상 B 70점 이상 C 아니라면 D
	}

	
	private static String stdAvg(int i) {
		String grade = "";
		if(i>=90) {
			grade = "A";
		}else if(i>=80){
			grade = "B";
		}else if(i>=70) {
			grade = "C";
		}else {
			grade = "D";
		}
		return grade;
	}


	private static String stdld(int i) {
		return "G"+i;
	}


	private static String myban(char c) {
		String str = "";
		if(c=='A') {
			str = "노랑조";
		}else if(c=='B') {
			str = "주황조";
		}
		return str;
	}


	private static int myadd(int i, int j) {
		return i+j;
	}


	private static String jangsu() {
		return "★★★★★";
	}


	private static String mycolor() {
		return "BLUE";
	}


	private static String return_float() {
		return String.format("%.4f",(float)(10/3.0));
	}


	private static int return_num() {
		return 1;
	}
	
}
