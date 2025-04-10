package com.company.boot003.jpa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int age;
	@Column(updatable = false)
	private LocalDateTime create_date = LocalDateTime.now();
	private String name;
	@OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
	List<Board> board = new ArrayList<>();
	
	
}
