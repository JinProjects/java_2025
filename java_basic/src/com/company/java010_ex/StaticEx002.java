package com.company.java010_ex;

class Mobile2{
	String serialNo; // 인스턴스 변수 - heap area - new 사용 - this(각각)
	static int count = 0; // 클래스변수 - method - new 사용 안됨 - static  - 바로사용가능
	
	public Mobile2() {
		serialNo = "2030-"+ ++count;
	}
	
}
public class StaticEx002 {

	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2();
		Mobile2 m2 = new Mobile2();
		Mobile2 m3 = new Mobile2();
		Mobile2 m4 = new Mobile2();
		
		System.out.println("모바일 갯수는 모두 "+Mobile2.count +"개 입니다.");
		System.out.println("m1의 제품번호 "+m1.serialNo);
		System.out.println("m2의 제품번호 "+m2.serialNo);
		System.out.println("m3의 제품번호 "+m3.serialNo);
		System.out.println("m4의 제품번호 "+m4.serialNo);
	}

}

/*---------------------------------runtime data area : JVM이 실행하는 영역
*[method : 정보, static, final] Mobile2.class  StaticEx002.class, count[1]
*--------------------------------------------
*[heap:동적]							| [stack:지역]
*18번 : {serialNo : 2030-4} 			← m4
*17번 : {serialNo : 2030-3} 			← m3
*16번 : {serialNo : 2030-2} 			← m2
*15번 : {serialNo : 2030-1} 			← m1		
*									| #2 main
*/