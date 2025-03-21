package com.company.java010_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 생성자 호출 초기화
class TV{
	//상태 - 멤버변수
	String channel;
	int volume;
	//행위 - 멤버함수
	//채널, 볼륨: input() / 출력 : show()
	
	TV(){}//기본생성자: TV() 컴파일러 기본 자동생성, 
		  //but 생성자를 개발자가 손대는 순간 자동생성 취소
	
	public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("* channel입력 >");
		this.channel = sc.next();
		System.out.print("* volume입력 >");
		this.volume = sc.nextInt();
	}
	void show() {
		System.out.println(this.channel + "\t" + this.volume);
	}
	
}
public class ClassEx004 {

	public static void main(String[] args) {
		TV t1 = new TV("JDBC",8);
		t1.show();
		TV t2 = new TV();
		t2.input(); 
		t2.show();
	
	}

}
/*---------------------------------runtime data area : JVM이 실행하는 영역
 *[method : 정보, static, final] TV.class / ClassEx004.class #1
 *--------------------------------------------
 *[heap:동적]									| [stack:지역]
 *39번째 줄 : 1번지 { channel=JDBC, volume=8 } ← 		t1 : 1번지 
 *40번째 줄									   		t1.show() {1번지의 channel출력, 1번지의 volume출력}
 *41번째 줄 : 2번지 { channel=null, volume=0 } ← 		t1 : 2번지
 *42번째 줄 : 2번지 { channel=youtube, volume=10 } ←   t2.input() {2번지의 channel입력, 2번지의 volume입력}  
 *43번째 줄 : 									 ←   t2.input() {2번지의 channel출력, 2번지의 volume출력}  
 *												| main #2
 *-------------------------------------------- 
 */


/*
 * 
 * class TV{
	
	}
 */