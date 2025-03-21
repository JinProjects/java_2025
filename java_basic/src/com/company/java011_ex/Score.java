package com.company.java011_ex;

public class Score {
	private String name;
	private int kor,eng,math,total;
	private double avg;
	private String p, s, rank;
	
	public Score() {
		this.name =this.rank = "";
		this.p = "불합격";
		this.s = "---";
	}
	
	public Score(String name, int kor, int eng, int math) {
		this();//객체 생성을 해줌
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		//객체 생성을 먼저하고 초기화를 해야하는데 this() 밑에 두면 
		//객체 생성을 안하고 먼저 초기화를 한다는 의미로 에러 
		//this() 
		
	}
	
	public static void info() {
		System.out.println(":::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println(":::::::::::::::::::::::::::::::::");
	}
	public void show() {
		total = kor + eng + math;
		avg = total/3.0;
		if(avg>=60) {
			p = "합격";
		}
		if(avg >= 95) {
			s = "장학생";
		}
		for(int i=0; i<(int)avg/10; i++) {
			rank += "*";
		}
		
		System.out.println(this.name+"\t"+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.total+"\t"+String.format("%.2f",this.avg)+"\t"+this.p+"\t"+this.s+"\t"+this.rank+"\t");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAver() {
		return avg;
	}
	public void setAver(double aver) {
		this.avg = aver;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}
