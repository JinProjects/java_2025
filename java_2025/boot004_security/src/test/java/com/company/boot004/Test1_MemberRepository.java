package com.company.boot004;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot004.member.Member;
import com.company.boot004.member.MemberRepository;
import com.company.boot004.member.MemberService;

@SpringBootTest
public class Test1_MemberRepository {
	@Autowired
	MemberRepository memberRepository;
	@Autowired
	MemberService memberService;
	//@Disabled
	@Test
	void insert() {
		Member member = new Member();
		member.setUsername("fourth");
		member.setPassword("1234");
		member.setEmail("fourth@fourth.com");
		memberService.insertMember(member);
		//memberRepository.save(member);
	}
	@Disabled
	//@Test
	void findAll() {
	   List<Member> list = memberRepository.findAllByOrderByDesc();
	   System.out.println(list.toString());
	}
	
	@Disabled
	//@Test
	void findId() {
	 Optional<Member> findMember = 	memberRepository.findById(1L);
	 if(findMember.isPresent()) {
		 Member member = findMember.get();
		 System.out.println(member.toString());
	 }
	}
	@Disabled
	//@Test
	void update() {
		Optional<Member> findMember = memberRepository.findById(1L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			member.setEmail("test@test.com");
			member.setUsername("test");
			memberRepository.updateById(member.getPassword(), member.getUsername(), member.getEmail(), member.getId());
		}
	}
	@Disabled
	//@Test
	void updatePassword() {
		Optional<Member> findMember = memberRepository.findById(2L);
		String password = "";
		if(findMember.isPresent()) {
			Member member = findMember.get();
			password = "1234";
			memberRepository.updateByIdAndPassword(password,member.getId(),member.getPassword());
		}
	}
	@Disabled
	//@Test
	void delete() {
		Optional<Member> findMember = memberRepository.findById(1L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			memberRepository.deleteByIdAndPassword(member.getId(), member.getPassword());
		}
	}
}
