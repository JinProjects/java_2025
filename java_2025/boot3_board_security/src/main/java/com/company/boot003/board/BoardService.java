package com.company.boot003.board;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.boot003.jpa.Board;
import com.company.boot003.jpa.BoardRepository;
@Service
public class BoardService{
	
	@Autowired
	BoardRepository boardRepository;
	
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return boardRepository.findAllByOrderByDesc();//전체리스트 뽑음
	}

	@Transactional //commit / rollback(되돌리기)
	public Board find(Long id) { //조회수 올리고 / 상세보기기능
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1); //기존조회수 + 1 
		boardRepository.save(board);
		return board;
	}

	public void insert(Board board, Long member_id) throws Exception {
		board.setBip(InetAddress.getLocalHost().getHostAddress());
		
		boardRepository.save(board);
	}

	public Board update_view(Long id) {
		
		return boardRepository.findById(id).get();
	}

	public int update(Board board) {
		return boardRepository.updateByIdAndBpass(board.getId(), board.getBpass(),board.getBtitle(),board.getBcontent());
		//boardRepository.save(board);
	}

	public int delete(Board board) {
		//boardRepository.delete(board); 기본동작 : delete from board where id = ?
		return boardRepository.deleteByIdAndBpass(board.getId(), board.getBpass());
	}
	
	public List<Board> findBoard(String bword){
		return boardRepository.findByBtitleAndBWriterOderbyIdDesc(bword);
	}
}
