package org.zerock.service;

import java.util.List;

import org.zerock.domain.boardVo;
import org.zerock.domain.criteria;

public interface boardService {

	Long register(boardVo vo);
	
	boardVo get(Long bno);
	
	int modify(boardVo vo);
	
	int remove(Long bno);
	
	List<boardVo> getList();
	
	List<boardVo> testcode();
	
	List<boardVo> testcode2();
	
	List<boardVo> getList(criteria cri);
	
	int getTotalCount(criteria cri);
	
}
