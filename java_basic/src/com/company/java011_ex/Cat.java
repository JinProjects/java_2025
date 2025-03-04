package com.company.java011_ex;
//class Cat{} << 같은 패키지 안에서만 사용 가능
public class Cat {
	public int public_1; //인스턴스변수 
	protected int protected_1;
			  int package_1;
	private	  int private_1;//Cat 내부에서만 접근가능
	
	
	public int getPrivate_1() {
		return private_1;
	}

	public void setPrivate_1(int private_1) {
		this.private_1 = private_1;
	}

	public static void main(String[] args) {

	}

}
