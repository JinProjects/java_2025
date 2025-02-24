package com.company.airplane;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.airplane.controller.AirPlaneController;
import com.company.airplane.controller.BaseController;
import com.company.airplane.controller.KoreaAirImpl;
import com.company.airplane.controller.MemberController;
import com.company.airplane.dto.Member;

public class AirPlaneMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("항공사를 선택해주세요.");
		//AirPaneController[] airPlane = {new KoreaAirImpl(), new AsianaAirImpl(), new JejuAirImpl(), new JinAirImpl()}
		AirPlaneController airplane = new KoreaAirImpl();
		//member List 
		ArrayList<Member> mList = new ArrayList<Member>();
		
		MemberController member = new KoreaAirImpl();
		
		BaseController menu = new KoreaAirImpl();
		
		int num = sc.nextInt();

		if(num==1) {//로그인
			
		}else if(num==2) {//회원가입
			member.newAccount(mList);
		}else if(num==3) {//회원탈퇴
			
		}else {//종료
			System.out.println("종료기능입니다.");
			System.exit(0);
		}
		
		
		
		
		AirPlaneController koreaAir = new KoreaAirImpl();		
		//while(true) {
			
//			if() {
//				
//			}
		//}
	}

}
