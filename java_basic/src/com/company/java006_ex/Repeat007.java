package com.company.java006_ex;

public class Repeat007 {

	public static void main(String[] args) {
		//1.for
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//1.while
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		int j = 1;
		//1.do while
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=5);
		System.out.println();
		//2.for
		for(int k=5; k>=1; k--) {
			System.out.print(k+" ");
		}
		System.out.println();
		//2.while
		int k=5;
		while(k>=1) {
			System.out.print(k+" ");
			k--;
		}
		System.out.println();
		//2.do while
		int l=5;
		do {
			System.out.print(l+" ");
			l--;
		}while(l>=5);
		System.out.println();
		//3.for
		for(int o = 1; o<=3; o++) {
			System.out.print("JAVA"+o+" ");
		}
		System.out.println();
		//3.while
		int o = 1;
		while(o<=3) {
			System.out.print("JAVA"+o+" ");
			o++;
		}
		System.out.println();
		int p=1;
		do {
			System.out.print("JAVA"+p+" ");
			p++;
		}while(p<=3);
	}

}
