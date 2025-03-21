package com.company.java011_ex;

public class Score2Process {
	int total = 0;
	public void process_avg(Score2[] stds) {
		//for(int i=0; i<std.length; i++) {
		for(Score2 std : stds) {
			total = std.getKor() + std.getEng() + std.getMath();
			std.setAvg(total/3.0);
		}
	};
	public void process_pass(Score2[] stds) {
//		for(int i=0; i<std.length; i++) {
		for(Score2 std : stds) {
			if(std.getAvg()>=60) {
				std.setPass("합격");
			}else {
				std.setPass("불합격");
			}
		}
	};
}
