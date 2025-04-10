package com.company.boot003.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
//양방향 관계에서는 ToString 호출하면 에러
//양방향 관계란 부모 자식 관계에서 toString을 호출할 때
//부모 객체나 자식객체를 호출하는 것
@ToString (exclude = "member")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Column(columnDefinition = "text")
	private String bcontent;
	
	private String bfile;
	
	private Long bhit = 0L;
	private String bip;
	private String bpass;
	@Column(length = 200)
	private String btitle;
	@Column(updatable = false)
	private LocalDateTime create_date = LocalDateTime.now();
	
	//부모 외래키의 필드명을 자식테이블에 mappedBy = member 그대로 사용해야 한다.
	//MEMBER_ID이 아닌 실제 필드명
	@ManyToOne
	@JoinColumn(name="memberId")
	Member member;
}
