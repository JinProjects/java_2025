package com.company.java010;

class Product{
	String name;
	int		price;
	
	public Product() {
		System.out.println("원하는 값으로 초기화- 생성자 수동생성시 컴파일러 자동생성 취소");
		// String 문자열은 null로 초기화
		// int는 0으로 초기화
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//@Override - 자식클래스(Product)에 맞게 수정 - 값 출력
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}

public class Class004 {
	public static void main(String[] args) {
		Product p1 = new Product(); //#3
		System.out.println(p1);
	}

}

/*---------------------------------runtime data area : JVM이 실행하는 영역
 *[method : 정보, static, final] Product.class, Class004.class #1
 *--------------------------------------------
 *[heap:동적]				| [stack:지역]
 *1번지 : {name=null, price=0}  ← p1
 *							| main #2
 *-------------------------------------------- 
 */
