package com.company.java011_ex;

public class ClassArrEx2 {

	public static void main(String[] args) {
		Score2[] std = new Score2[3];
		std[0] = new Score2("아이언맨",100,100,100);
		std[1] = new Score2("헐크",90,60,80);
		std[2] = new Score2("블랙팬서",20,60,90);
		
		Score2Process process = new Score2Process();
		process.process_avg(std);
		process.process_pass(std);
		
		Score2Print print = new Score2Print();
		print.show(std);
	}

}
