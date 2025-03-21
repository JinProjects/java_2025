package com.company.java013;

import java.lang.reflect.Executable;

abstract class Process{
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);
	
}
class Total extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		return kor+eng+math;
	}

	@Override
	double exec(int total) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String exec(double avg) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Avg extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double exec(int total) {
		return total/3.0;
	}

	@Override
	String exec(double avg) {
		return null;
	}
	
}
class Jang extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double exec(int total) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String exec(double avg) {
		String str = "-----";
		if(avg >= 95) {
			str = "장학생";
		}
		return str;
	}
	
}
class Star extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double exec(int total) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String exec(double avg) {
		String str= "";
		for(int i=0; i<(int)avg/10; i++) {
			str += "*";
		}
		return str;
	}
	
}
class Pass extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double exec(int total) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String exec(double avg) {
		String str = "불합격";
		if(avg>=60) {
			str = "합격";
		}
		return str;
	}
	
}
class Score {
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	public Score() {
	}
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}

class ScoreDto extends Score{
	private String jang;
	private String star;
	private String pass;
	public ScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreDto(String name, int kor, int eng, int math) {
		super(name, kor, eng, math);
	}

	public String getJang() {
		return jang;
	}
	public void setJang(String jang) {
		this.jang = jang;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
abstract class Print {
	abstract void show();
	abstract void show(ScoreDto std);
}
class StdPrint extends Print{
	@Override
	void show() {
		System.out.println(":::::::::::::::::::::");
		System.out.println("총점\t평균\t장학생\t순위\t합격여부");
		System.out.println(":::::::::::::::::::::");
	}
	@Override
	void show(ScoreDto std) {
		System.out.println(":::::::::::::::::::::");
		System.out.println("총점\t평균\t장학생\t순위\t합격여부");
		System.out.println(+std.getTotal()+"\t"+std.getAvg()+"\t"+std.getJang()+"\t"+std.getStar()+"\t"+std.getPass());
		System.out.println(":::::::::::::::::::::");
	}
	
}
public class Abstract010 {

	public static void main(String[] args) {
		ScoreDto std = new ScoreDto("헐크",100,100,99);
		
		Process process = new Total();
			//{new Total(), new Avg(), new Jang(), new Star(), new Pass()};
		double total = process.exec(std.getKor(),std.getEng(),std.getEng());
		std.setTotal((int)total);
		
		process = new Avg();
		double avg = process.exec((int)total);
		std.setAvg(avg);
		
		process = new Jang();
		String jang = process.exec(avg);
		std.setJang(jang);
		
		
		process = new Star();
		String star = process.exec(avg);
		std.setStar(star);
		
		process = new Pass();
		String pass = process.exec(avg);
		std.setPass(pass);
		
		
		Print print = null;
		print = new StdPrint();
		print.show(std);
	}

}
