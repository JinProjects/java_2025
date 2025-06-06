package com.company.boot001.myjpa;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
//@Data
@Getter
@Setter
@ToString
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column(name="USERNAME", nullable=false) 필드명 수정, NOT NULL 설정
	@Column(name="USERNAME", nullable=false) //@Transiend 컬럼인식 못 하게
	private String name;
	private int age;
	@Column(updatable = false) // 수정 못 하게
	private String create_date = LocalDateTime.now().toString();
	
	@ManyToOne
	private Team team; 
	// 멤버(iron, hulk, thor.....)는 하나의 팀을 가진다.
	// team_id 컬럼 자동으로 생김
	@ManyToMany(mappedBy = "members")
	private Set<ChatRoom> chatRooms = new HashSet<>();
	
}

/*
 * 관계1
 * 팀(avengers)은 많은 멤버(iron, hulk....)를 가진다.
 * 멤버는 하나의 팀을 가진다.
 * team -|-------------∈ member 1개의 팀은 많은 멤버를 가진다
 * 
 * 
 * */
