package com.company.java009_ex;


class Student001{
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	void info() {
		int total = this.kor + this.eng + this.math;
		System.out.println("이름:"+this.name);
		System.out.println("총점:"+total);
		System.out.println("평균:"+String.format("%.2f", (double)total/3));
	}
}
public class ClassEx001 {
	public static void main(String[] args) {
		Student001 s1 = new Student001();
		s1.name ="first";
		s1.no = 11;
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.info();
	}

}
/* 클래스는 설계도 - 인스턴스화 ( heap - new - 객체생성) 를 통해 - 객체(객체들) / 
 * 인스턴스(각각의 s1.name, s2.name)
 * 
 * ------------------------------------[runtime data area]
 *[method: 정보, static, final:공용정보] 
 * ------------------------------------
 * [heap: 동적]												|[stack: 잠깐 빌리기]	
 * 20번째 줄 : 1번지 {name=null, no=0, kor=0, eng=0, math=0}	← s1 : 1번지
 * 21~25번째 줄 : 1번지 {name=first, no=11, kor=100, eng=100, math=99} ← s1 : 1번지
 * 															|main
 * ------------------------------------------------------------------------ 
 * 
 */
