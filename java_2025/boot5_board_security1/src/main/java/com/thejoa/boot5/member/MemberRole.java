package com.thejoa.boot5.member;

import lombok.Getter;

@Getter
public enum MemberRole {
	ADMIN("ROLE_ADMIN"), MEMBER("ROLE_Member");
	private String value;
	private MemberRole(String value) {
		this.value = value;
	}
}
