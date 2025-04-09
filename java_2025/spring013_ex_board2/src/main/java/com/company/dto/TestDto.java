package com.company.dto;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

//@Data
@RequiredArgsConstructor //final TestDto(string)
@NoArgsConstructor(force=true) //강제로 필드에 null or 초기화
public class TestDto {
	private final String company;
	private int year;
	
//	public TestDto(String company, int year) {
//		super();
//		this.company = company;
//		this.year = year;
//	}
}
