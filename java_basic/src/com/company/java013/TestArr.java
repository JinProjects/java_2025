package com.company.java013;

class A{
	private String name;
	
	public A() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
	
}
public class TestArr {

	public static void main(String[] args) {
		A[] arrs = new A[3];
		arrs[0] = new A();
		arrs[1] = new A();
		arrs[2] = new A();
		//주의사항) 생성자를 호출해 인스턴스변수를 사용가능하게 만들어야 함
		for(A arr : arrs) {
			System.out.println(arr);
		}
		
	}

}
//q14 오버라이딩 : 상속시 부모메서드와 같은 메서드 