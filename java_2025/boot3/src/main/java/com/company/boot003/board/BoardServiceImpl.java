package com.company.boot003.board;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.boot003.jpa.Board;
import com.company.boot003.jpa.BoardRepository;
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return boardRepository.findAll();//전체리스트 뽑음
	}

	@Transactional //commit / rollback(되돌리기)
	@Override
	public Board find(Long id) { //조회수 올리고 / 상세보기기능
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1); //기존조회수 + 1 
		boardRepository.save(board);
		return board;
	}

	@Override
	public void insert(Board board) throws Exception {
		board.setBip(InetAddress.getLocalHost().getHostAddress());
		boardRepository.save(board);
	}

	@Override
	public Board update_view(Long id) {
		
		return boardRepository.findById(id).get();
	}

	@Override
	public void update(Board board) {
		boardRepository.save(board);
	}

	@Override
	public void delete(Board board) {
		boardRepository.delete(board);
	}
	
}
