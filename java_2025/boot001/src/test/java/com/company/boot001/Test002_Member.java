package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Member;
import com.company.boot001.myjpa.MemberRepository;
import com.company.boot001.myjpa.Team;

@SpringBootTest
public class Test002_Member {
	@Autowired
	MemberRepository memberRepository;
	
	//@Test
	@Disabled
	public void insert() {
		Team team = new Team();
		team.setId(2L);//##1 팀설정
		
		Member member = new Member();
		member.setName("first");
		member.setAge(11);
		member.setTeam(team);
		memberRepository.save(member); //## insert, update - save
	}
	
	//insert into member (name, age, create_date, team_id) values (?,?,?,?)
	//Q2. findAll 유저들 출력
	
	//@Test
	@Disabled
	public void selectAll() {
		List<Member> list = memberRepository.findAll();
		
		list.forEach((e)-> System.out.println(e.toString()) );
	}
	
	//Q3. update 이용해서 유저번호가 1L인 데이터값 수정
	//@Test
	@Disabled
	public void update() {
		Optional<Member> findMember = memberRepository.findById(2L);
		if(findMember.isPresent()) {
			Member member = findMember.get();			
			member.setAge(22);
			member.setName("second");
			memberRepository.save(member);
		}
		
	}
	
	//Q4. delete 이용해서 1L유저 삭제
	@Test
	//@Disabled
	public void delete() {
		Optional<Member> findMember = memberRepository.findById(1L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			memberRepository.delete(member);
		}
		
	}
}
