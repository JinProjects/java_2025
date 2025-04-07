package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Member;
import com.company.boot001.myjpa.MemberRepository;

@SpringBootTest
class MemberTest {
	@Autowired
	MemberRepository memberRepository;
	
	
	@Test
	//@Disabled
	void insert() {
		// teamRepository.save (insert, update) / delete - (delete) 
		// teamRepository.findAll select/ teamRepository.findById select
		Member member = new Member();
		member .setName("홍길동");
		member.setAge(34);
		memberRepository.save(member);
		//teamRepository.deleteById((long) 3);
	}
	//@Test
	@Disabled
	public void selectAll() {
		List<Member> list = memberRepository.findAll();
		list.forEach((e) -> System.out.println(e.toString()));
	}
	//@Test
	@Disabled
	public void update() {
		//Optional<Team> null 값 안전보장
		//1.수정 할 팀 찾기
		Optional<Member> findMember = memberRepository.findById(2L);
		//teamRepository.save(team);
		//2. 이름변경해서 수정
		Member member = findMember.get();
		member.setName("고길동");
		member.setAge(22);
		memberRepository.save(member);
		// save : insert, update
	}
	
	//@Test
	@Disabled
	public void delete() {
		Optional<Member> findMember = memberRepository.findById(1L);
		
		Member member = findMember.get();
		memberRepository.delete(member);
	}
	
	
}
//* crud1. insert into team (name) values ('milk')
//* crud2. select * from team / select * from team where id=?
//* crud3. update team set name = ? where id=?
//* crud4. delete from  team where id=?