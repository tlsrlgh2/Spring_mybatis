package org.zerock.service;

import java.util.List;

import org.zerock.domain.boardVo;

public interface boardService {

	Long register(boardVo vo);
	
	boardVo get(Long bno);
	
	int modify(boardVo vo);
	
	int remove(Long bno);
	
	List<boardVo> getlList();
	
	List<boardVo> testcode();
	
	List<boardVo> testcode2();
	
}
