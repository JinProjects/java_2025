package com.company.java011;

import com.company.java011_ex.Cat;

public class Modifier1_public {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.public_1 = 10; //public 아무데서나 접근가능
//		cat.protected_1 //안보임 The field Cat.protected_1 is not visible
//		cat.package_1 안보임 The field Cat.package_1 is not visible
//		cat.private_1 안보임 The field Cat.private_1 is not visible
		cat.setPrivate_1(10);
		System.out.println(cat.public_1 + "/" + cat.getPrivate_1());
		// private 은 getter + setter를 이용
	}

}
