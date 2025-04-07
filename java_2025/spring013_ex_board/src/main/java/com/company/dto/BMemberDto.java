package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BMemberDto {
	private String mid;
	private String mpass;
	private String mnickname;
	private String memail;
	private String address1;
	private String address2;
	private String address3;
	private String mip;
	private String mdate;
	
}
