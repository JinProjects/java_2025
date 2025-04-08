package com.company.boot001.myjpa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Team {
	@Id //1. 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) //2. 숫자자동증가
	private Long id;
	
	private String name;
	private LocalDateTime createDate = LocalDateTime.now();
	
	@Transient //3.컬럼인식 못하게 함(테이블 생성할 때 email은 빼고 생성)
	private String email;
	//mappedBy 부모테이블이 있으면 참조
	@OneToMany(mappedBy = "team", cascade =CascadeType.REMOVE )
	List<Member> member = new ArrayList<Member>();
	
}
