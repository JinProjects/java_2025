package com.company.domain;

public class MemberVO {
	private String mid;
	private String mpass;
	private String mnickname;
	private String adress1;
	private String adress2;
	private String adress3;
	private String mip;
	private String mdate;
	
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String mid, String mpass, String mnickname, String adress1, String adress2, String adress3,
			String mip, String mdate) {
		super();
		this.mid = mid;
		this.mpass = mpass;
		this.mnickname = mnickname;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.adress3 = adress3;
		this.mip = mip;
		this.mdate = mdate;
	}

	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpass=" + mpass + ", mnickname=" + mnickname + ", adress1=" + adress1
				+ ", adress2=" + adress2 + ", adress3=" + adress3 + ", mip=" + mip + ", mdate=" + mdate + "]";
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

	public String getAdress1() {
		return adress1;
	}

	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}

	public String getAdress2() {
		return adress2;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}

	public String getAdress3() {
		return adress3;
	}

	public void setAdress3(String adress3) {
		this.adress3 = adress3;
	}

	public String getMip() {
		return mip;
	}

	public void setMip(String mip) {
		this.mip = mip;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	
}
