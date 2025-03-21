package com.company._0311;


class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	private String pass;
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]";
	}
	

}

class ScoreProcess{
	public ScoreProcess() {
		// TODO Auto-generated constructor stub
	}
	public void process_avg(Score[] std) {
		int total = 0;
		
		for(int i=0; i<std.length; i++) {
			total = std[i].getKor() + std[i].getEng() + std[i].getMath();
			std[i].setAvg(total/3.0);
		}
	}
	public void process_pass(Score[] std) {
		String str = "불합격";
		for(int i=0; i<std.length; i++) {
			if(std[i].getAvg()>=60 && 
				(std[i].getKor()<40 || std[i].getEng()<40 || std[i].getMath()<40)) {
				str = "과락";
			}else if(std[i].getAvg()>=60) {
				str = "합격";
			}else {
				str = "불합격";
			}
			std[i].setPass(str);
		}
		
	}
}
class ScorePrint{
	public void show_title() {
		System.out.println(":::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println(":::::::::::::::::::::::::::::::::");
	}
	public void show(Score[] std) {
		for(Score s : std) {
			System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"
					+s.getMath()+"\t"+String.format("%.2f", s.getAvg())+"\t"+s.getPass());
		}
	}
}
public class ClassArr004 {

	public static void main(String[] args) {
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨",100,100,100);
		std[1] = new Score("헐크",90,60,80);
		std[2] = new Score("블랙팬서",20,60,90);
		
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show_title();
		print.show(std);
	}

}
