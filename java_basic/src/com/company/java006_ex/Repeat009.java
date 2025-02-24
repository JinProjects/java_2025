package com.company.java006_ex;

public class Repeat009 {

	public static void main(String[] args) {
		int k = 1;
		//for
		for(char j='A'; j<='Z'; j++) {
			System.out.print(j);
			if(k==5) {
				System.out.println();
				k = 0;
			}
			k++;
		}
		System.out.println();
		
		//while
		char j = 'A';
		k = 1;
		while(j<='Z') {
			System.out.print(j);
			if(k==5) {
				System.out.println();
				k=0;
			}
			j++;
			k++;
		}
		System.out.println();
		
		//do while
		j = 'A';
		k = 1;
		do {
			System.out.print(j);
			if(k == 5) {
				System.out.println();
				k=0;
			}
			k++;
			j++;
		}while(j<='Z');
	}

}
