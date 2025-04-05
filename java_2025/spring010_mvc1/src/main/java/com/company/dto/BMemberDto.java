package com.company.dto;

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

	public BMemberDto() {
		// TODO Auto-generated constructor stub
	}

	public BMemberDto(String mid, String mpass, String mnickname, String memail, String address1, String address2,
			String address3, String mip, String mdate) {
		super();
		this.mid = mid;
		this.mpass = mpass;
		this.mnickname = mnickname;
		this.memail = memail;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.mip = mip;
		this.mdate = mdate;
	}
	
	public BMemberDto(String mid, String mpass, String mnickname, String memail, String address1, String address2,
			String address3, String mip) {
		super();
		this.mid = mid;
		this.mpass = mpass;
		this.mnickname = mnickname;
		this.memail = memail;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.mip = mip;
	}

	@Override
	public String toString() {
		return "BMember [mid=" + mid + ", mpass=" + mpass + ", mnickname=" + mnickname + ", memail=" + memail
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", mip=" + mip
				+ ", date=" + mdate + "]";
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	public String getMnickname() {
		return mnickname;
	}

	public void setMnickname(String mnickname) {
		this.mnickname = mnickname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getMip() {
		return mip;
	}

	public void setMip(String mip) {
		this.mip = mip;
	}

	public String getDate() {
		return mdate;
	}

	public void setDate(String mdate) {
		this.mdate = mdate;
	}
	
}
