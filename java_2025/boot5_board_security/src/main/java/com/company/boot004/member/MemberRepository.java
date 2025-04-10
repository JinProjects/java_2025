package com.company.boot004.member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member, Long>{
	Optional<Member> findByUsername(String username);
	
	@Query("select m from Member m Order by m.id desc")
	List<Member> findAllByOrderByDesc();
	@Modifying
	@Transactional
	@Query("delete from Member m where m.id = :id and m.password = :password")
	int deleteByIdAndPassword(Long id, String password);
	
	@Modifying
	@Transactional
	@Query(value ="update Member m "
			+ " set m.password = :password "
			+ "		, m.username = :username "
			+ "		, m.email = :email "
			+ "where m.id = :id ")
	int updateById(String password, String username, String email, Long id);
	@Modifying
	@Transactional
	@Query("update Member m "
			+ "set m.password = :password "
			+ "where m.id = :id "
			+ "  and m.password = :oldPassword")
	int updateByIdAndPassword(String password, Long id, String oldPassword);
	
}
//insert into member(username, password, email) values (?,?,?) - save
//select * from member - findAll
//select * from member where id=? -findById
//update member set email=?,username=?,password=? where id=?
//delete from member where id=?

// Q2. @Query 아이디와 비번이 같은 유저의 비밀번호 변경
// update Member m set m.password = :password where m.id = :id and m.password = :oldPassword