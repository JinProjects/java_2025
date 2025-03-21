package com.company.java012;

/*                                                     27번째 : Green g = new Green();
 * Object												Object(){#3   }#4
 *   ↑											
 *  Color     name(private)								Color(){#2    }#5  name 인스턴스변수 사용가능
 *   ↑
 *  Green	  num (private)   /    void show(){}		Green(){#1    }#6  num 인스턴스변수 사용가능
 * 													생성자 호출하면서 상속한 부모클래스(Color.class) 객체도 생성
 * */
class Color extends Object{
	private String name;

	public String getName() {
		return name; 
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Green extends Color{
	
	int num;
	
	public Green() {
		this.setName("");
		this.num = 0;
	}
	
	void show() {
		System.out.println("::::::: GREEN");
		System.out.println("= NAME : " +this.getName());
		System.out.println("= NUM : " + this.num);
	}
}

public class Extends002 {

	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.num = 5;
		mygreen.show();
	}

}
