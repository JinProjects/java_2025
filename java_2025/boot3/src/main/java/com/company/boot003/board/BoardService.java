package com.company.boot003.board;

import java.util.List;

import com.company.boot003.jpa.Board;

public interface BoardService {
	public List<Board> findAll(); //전체리스트
	public Board find(Long id); // 조회수 올리고 상세보기
	public void insert(Board board) throws Exception; //알림창 만들거면 int로 변경해서 1또는 0 받음
	public Board update_view(Long id);//수정하기 폼
	public void update(Board board);//글수정기능
	public void delete(Board board);
	
}
