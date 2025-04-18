package com.company.boot004.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.company.boot004.board.Board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Column(unique=true) //유일한값 설정
	private String memberId;
	private String password;
	@Column(unique=true)
	private String email;
	@Column(updatable = false)
	private LocalDateTime udate = LocalDateTime.now();
	
	@OneToMany
	List<Board> board = new ArrayList<>();
	
}
