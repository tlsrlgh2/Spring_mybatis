package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.boardVo;
import org.zerock.domain.criteria;

public interface BoardMapper {

	List<boardVo> getList();
	
	void insert(boardVo vo);
	
	void insertSelectkey(boardVo vo);
	
	boardVo read(Long bno);
	
	int delete(Long bno);
	
	int upload(boardVo vo);
	
	List<boardVo> testcode();
	
	List<boardVo> testcode2();
	
	List<boardVo> getListWithPaging(criteria cri);
	
}
