package com.company.java006_ex;

public class Repeat008 {

	public static void main(String[] args) {
		int hap = 0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				hap += i;
			}
		}
		System.out.println("1~10까지 3의 배수의 합 : "+hap);
		int i=0;
		int total = 0;
		while(i<=10) {
			if(i%3==0) {
				total += i;
			}
			i++;
		}
		System.out.println("1~10까지 3의 배수의 합 : "+total);
		int k=0;
		int sum = 0;
		do {
			if(k%3==0) {
				sum += k;
			}
			k++;
		}while(k<=10);
		System.out.println("1~10까지 3의 배수의 합 : "+sum);
	}

}
