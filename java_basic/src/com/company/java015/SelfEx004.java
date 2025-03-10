package com.company.java015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score24{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	private int total;
	
	public Score24() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score24(String name, int kor, int eng, int math) {
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public int hashCode() {
		return Objects.hash(avg, eng, kor, math, name, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score24 other = (Score24) obj;
		return Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg) && eng == other.eng
				&& kor == other.kor && math == other.math && Objects.equals(name, other.name) && total == other.total;
	}
	
}
class Process {
	void process_avg(Set<Score24> scores) {
		Iterator<Score24> iter = scores.iterator();
		while(iter.hasNext()) {
			Score24 s = iter.next();
			s.setTotal(s.getKor() + s.getEng() + s.getMath());
			s.setAvg(s.getTotal()/3.0);
		}
	}
}
class Print{
	
	public void print_title() {
		System.out.println(":::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(":::::::::::::::::::::::::::::::::::::");
	}
	public void print(Set<Score24> scores) {
		Iterator<Score24> iter = scores.iterator();
		while(iter.hasNext()) {
			Score24 s = iter.next();
			System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"
					+s.getMath()+"\t"+s.getTotal()+"\t"+String.format("%.2f", s.getAvg())+"\t");
			
		}
	}
}
public class SelfEx004 {

	public static void main(String[] args) {
		Set<Score24> scores = new HashSet<>();
		scores.add(new Score24("아이언맨",30,40,50));
		scores.add(new Score24("아이언맨",30,40,50));
		scores.add(new Score24("아이언맨",30,40,50));
		scores.add(new Score24("헐크",40,60,70));
		scores.add(new Score24("캡틴",80,90,100));
		Process process = new Process();
		process.process_avg(scores);
		
		Print print = new Print();
		print.print_title();
		print.print(scores);
		
		System.out.println("갯수 : " +scores.size());
		
	}

}
