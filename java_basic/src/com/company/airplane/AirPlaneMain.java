package com.company.airplane;

import java.util.Scanner;

import com.company.airplane.controller.AirPlaneController;
import com.company.airplane.controller.KoreaAir;
import com.company.airplane.dto.Member;

public class AirPlaneMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("항공사를 선택해주세요.");
		int num = sc.nextInt();

		if(num==1) {//로그인
			
		}else if(num==2) {//회원가입
			
		}else if(num==3) {//회원탈퇴
			
		}else {//종료
			System.out.println("종료기능입니다.");
			System.exit(0);
		}
		
		
		
		
		AirPlaneController koreaAir = new KoreaAir();		
		//while(true) {
			
//			if() {
//				
//			}
		//}
	}

}
