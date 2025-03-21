package com.company.java011;

import com.company.java011_ex.Cat;

class Cat2 extends Cat{//Cat2 : java011 / Cat : java011_ex
	public void show() { //인스턴스 메서드
		public_1 = 10;
		protected_1 = 20;  //extends 사용가능 - 상속받은 자식만 사용가능
	//	package_1 = 30;    //같은 폴더에서 사용가능 - 오류이유: 폴더가 다르다.
		//private_1 = 40;    //Cat 클래스에서만 사용 - getter/setter 
		System.out.println(public_1 + "/"+protected_1);
	}
} //2. extends Cat의 기능 사용[상속]

public class Modifire2_protected extends Cat2{

	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.public_1 = 100;
		cat2.show();
	//	cat2.protected_1 = 200; //상속한 클래스에서만 사용 가능함
		//cat.public_1 = 10; //public 아무데서나 접근가능
		
		
	}

}
/*
(1) runtime data area
* -----------------------------------
* [method : 정보, 공유] 
* -----------------------------------
* [heap:동적] 			| [stack:임시]
* 						| main ##2.
* -----------------------------------
*/