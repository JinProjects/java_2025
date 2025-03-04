package com.company.java011_ex;

//1. 클래스부품객체 - 상태와 행위
//2. final - 수정하지마

/*
 * 초기화 순서 :   기본값 → 명시적초기화 → 초기화블록 → 생성자
 * final  nation null 	korea 		korea(x)	korea(x)
 * final  jumin	 null 	null(x)		null(x)     "000000" 
 *        name	 null	null(x)		null(x)		.연산자이용, (0) 수정가능
 * */
class User002{
	final String nation = "Korea"; //수정불가능
	final String jumin; //수정불가능
	String name; 
	public User002() {
		this.jumin = "000000";
	}
	public User002(String jumin, String name) {
		super();
		this.jumin = jumin;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	
}
public class FinalEx {

	public static void main(String[] args) {
		User002 user1 = new User002("123456-1234567","아이유");
		System.out.println(user1);
		
//		user1.nation = "USA";//값을 변경할 수 없음
//		user1.jumin = "123456-1234567";//값을 변경할 수 없음
		user1.name = "IU";
		
		System.out.println(user1);
	}

}

/*
 * ---------------------------
 * [method:정보]  User002.class, FinalEx.class //##1
 * ---------------------------
 * [heap]						| [stack]
 * 1번지 : {nation=Korea, jumin="123456-1234567", name="IU"} ← user1
 * 								| main //##2
 * ---------------------------
 *
 */