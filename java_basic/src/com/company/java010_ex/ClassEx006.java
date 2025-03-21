package com.company.java010_ex;

class Score{
	String stdid;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public Score(String stdid, int kor, int eng, int math) {
		super();
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score() {
		super();
	}
	void total() {
		this.total = this.kor+this.eng+this.math;
	}
	void avg() {
		this.avg = (double)this.total/3;
	}
	void info() {
		total();
		avg();
		System.out.println("학번\tkor\teng\tmath\ttotal\tavg");
		System.out.println(this.stdid+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.total+"\t"+String.format("%.2f", this.avg));
	}
}
public class ClassEx006 {

	public static void main(String[] args) {
		Score s1 = new Score("std1234",100,100,99);
		s1.info();
	}

}
