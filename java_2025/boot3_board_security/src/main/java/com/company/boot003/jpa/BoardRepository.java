package com.company.boot003.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board, Long> {
	//1.@Query 객체파라미터 지원 (테이블명 : Board)  - select 기본작업
	// List<Board> findAllByOrderByIdDesc();
	//@Query(value="select * from Board order by id desc", nativeQuery = true)
	@Query(value="select b from Board b order by id desc")
	List<Board> findAllByOrderByDesc();
	
	//2. insert,update,delete
	@Modifying //2-1. 삽입, 수정, 삭제 쿼리는 변경작업 (반드시 작성해야함)
	@Transactional//2-2. rollback 활성화
	@Query("delete from Board b where b.id= :id and b.bpass = :bpass")
	int deleteByIdAndBpass( @Param("id") Long id, @Param("bpass") String bpass);
	//2-3 @Param("id") 쿼리의 변수명과 동일하면 생략가능
	//2-4 deleteByIdAndBpass( Board board ) X 객체파라미터 지원 안함
	
	//1. id와 pass가 같으면 delete 해주기
	//2.id와 pass가 같으면 btitle과 bcontent 수정하기
	
	@Modifying
	@Transactional
	@Query("update Board b set b.btitle = :btitle, b.bcontent = :bcontent where b.id = :id and b.bpass = :bpass")
	int updateByIdAndBpass(Long id, String bpass, String btitle, String bcontent);
	
	//작성자 및 글제목
	@Query(value="select * from Board b left join Member m "
			+ "on b.member_id = m.id "
			+ "where b.btitle like %:bword% "
			+ "or m.name like %:bword% "
			+ "order by b.id desc ", nativeQuery = true)
	List<Board> findByBtitleAndBWriterOderbyIdDesc(String bword);
}
