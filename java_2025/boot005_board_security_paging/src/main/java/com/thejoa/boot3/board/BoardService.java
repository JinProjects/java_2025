package com.thejoa.boot3.board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.thejoa.boot3.member.MemberRepository;

@Service 
public class BoardService {
	@Autowired BoardRepository  boardRepository;
	@Autowired MemberRepository  memberRepository;
	
	//PAGING
	//PAGING
	//1: 최신글 10		order by bno desc limit 0,10	0번째부터 10개
	//2: 최신글 10		order by bno desc limit 10,10	10번째부터 10개
	public Page<Board> getPaging(int page){ //어디서부터
		List<Sort.Order> sort = new ArrayList<>();
		sort.add(Sort.Order.desc("id"));
		
		Pageable pageable = PageRequest.of(page, 10, Sort.by(sort));
		return boardRepository.findAll(pageable);
	}
	
	
	
	
	//Board
	//Board
	
	//전체리스트
	public List<Board> findAll() {
		//return boardRepository.findAll();
		return boardRepository.findAllByOrderByDesc();
	}
	
	//조회수올리고 상세보기
	@Transactional //commit(반영) / rollback(되돌리기)
	public Board find(Long id) {
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1);//기존조회수+1
		boardRepository.save(board);
		return board;
	}

	//글쓰기 기능
	public void insert(Board board) {
		board.setMember(
				memberRepository.findByUsername( board.getMember().getUsername() ).get()
				);
		
		try { board.setBip(InetAddress.getLocalHost().getHostAddress());}
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	//수정하기 폼
	public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}

	//글수정기능
	public int update(Board board) {
		return boardRepository.updateByIdAndBpass(board.getId(),
												  board.getBpass(),
												  board.getBtitle(),
												  board.getBcontent()
												);
	}

	//글삭제기능
	public int delete(Board board) {
		//boardRepository.delete(board); 기본: delete from board where id=?
		return boardRepository.deleteByIdAndBpass( board.getId(), board.getBpass() );
	}

}
