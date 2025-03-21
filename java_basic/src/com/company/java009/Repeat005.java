package com.company.java009;

import java.util.Scanner;

public class Repeat005 {

	public static void main(String[] args) {
		char[][] arr2 = new char[2][3];
			char ch = 'a';
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					arr2[i][j] = ch;
					ch++;
				}
			}
			for(int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.print(arr2[i][j]+ " ");
				}
			}
	}
}
