package com.company.boot003;

import java.net.InetAddress;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.boot003.jpa.Board;
import com.company.boot003.jpa.BoardRepository;
import com.company.boot003.jpa.Member;
import com.company.boot003.jpa.MemberRepository;

@SpringBootTest
public class BoardTest {
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	BoardRepository boardRepository;
	//@Test
	@Disabled
	public void insertMember() {
		Member member = new Member();
		member.setAge(2);
		member.setName("second");
		memberRepository.save(member);
	}
	//@Test
	@Disabled
	public void insertBoard() {
		Member member = new Member();
		member.setId(2L);
		Board board = new Board();
		board.setBtitle("제목3");
		board.setBcontent("내용3");
		board.setBpass("3333");
		board.setBfile("2.png");
		try {
		board.setBip(InetAddress.getLocalHost().getHostAddress());
		}catch (Exception e) {
			e.printStackTrace();
		}
		board.setMember(member);
		boardRepository.save(board);
	}
	//@Test
	@Disabled
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		System.out.println(list.get(0).getBtitle());
	} 
	//editview
	//@Test
	@Disabled
	public void findByIdBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board.getBtitle());
		}
		
	} 
	//@Test
	@Disabled
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	
	@Test
	public void deleteBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			boardRepository.delete(board);
		}
	}
	
	@Test
	public void updateHit() {
		Optional<Board> findBoard =  boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBhit(board.getBhit()+1);
			boardRepository.save(board);
		}
	}
	//@Test
	@Disabled
	public void selectAll() {
		List<Member> memList = memberRepository.findAll();
		
		System.out.println(memList.toString());
	}
	//@Test
	@Disabled
	public void selectOne() {
		Optional<Member> findMember = memberRepository.findById(2L);
		if(findMember.isPresent()) {
			Member member = findMember.get();
			System.out.println(member.toString());
		}
	}
}
