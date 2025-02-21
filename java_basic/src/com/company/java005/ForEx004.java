package com.company.java005;

public class ForEx004 {

	public static void main(String[] args) {
		int cnt = 0;
		String result = "3의 배수 :";
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				cnt++;
				result += (cnt==1?"":",")+i;
			}
		}
		System.out.println(result + "\n갯수 :" + cnt);
	}

}
