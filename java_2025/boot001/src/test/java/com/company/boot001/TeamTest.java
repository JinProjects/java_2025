package com.company.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot001.myjpa.Team;
import com.company.boot001.myjpa.TeamRepository;

@SpringBootTest
class TeamTest {
	@Autowired
	TeamRepository teamRepository;
	
	
	@Test
	//@Disabled
	void insert() {
		// teamRepository.save (insert, update) / delete - (delete) 
		// teamRepository.findAll select/ teamRepository.findById select
		Team team = new Team();
		team.setName("");//fruit,animal
		teamRepository.save(team);
		//teamRepository.deleteById((long) 3);
	}
	//@Test
	@Disabled
	public void selectAll() {
		List<Team> list = teamRepository.findAll();
		System.out.println(list.size());
		list.forEach((t)->{System.out.println(t.toString());});
	}
	//@Test
	@Disabled
	public void update() {
		//Optional<Team> null 값 안전보장
		//1.수정 할 팀 찾기
		Optional<Team> findTeam = teamRepository.findById(1L);
		System.out.println(findTeam.isPresent());
		//teamRepository.save(team);
		//2. 이름변경해서 수정
		Team team = findTeam.get();
		team.setName("avenger");
		teamRepository.save(team); // save : insert, update
	}
	
	//@Test
	@Disabled
	public void delete() {
		Optional<Team> findTeam = teamRepository.findById(3L);
		System.out.println(findTeam.isPresent());
		Team team = findTeam.get();
		teamRepository.delete(team);
	}
	
}
//* crud1. insert into team (name) values ('milk')
//* crud2. select * from team / select * from team where id=?
//* crud3. update team set name = ? where id=?
//* crud4. delete from  team where id=?