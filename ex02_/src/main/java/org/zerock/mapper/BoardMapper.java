package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.boardVo;

public interface BoardMapper {

	List<boardVo> getList();
	
	void insert(boardVo vo);
	
	void insertSelectkey(boardVo vo);
	
	boardVo read(Long bno);
	
	int delete(Long bno);
	
	int upload(boardVo vo);
	
	List<boardVo> testcode();
	
	List<boardVo> testcode2();
	
}
