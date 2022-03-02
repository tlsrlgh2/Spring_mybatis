package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.boardVo;
import org.zerock.domain.criteria;
import org.zerock.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class boardServiceImpl implements boardService{

	private final BoardMapper mapper;

	@Override
	public Long register(boardVo vo) {
		
		mapper.insertSelectkey(vo);
		
		return vo.getBno();
	}

	@Override
	public boardVo get(Long bno) {
		
		return mapper.read(bno);
	}

	@Override
	public int modify(boardVo vo) {

		return mapper.upload(vo);
	}

	@Override
	public int remove(Long bno) {

		return mapper.delete(bno);
	}

	@Override
	public List<boardVo> getList() {

		return mapper.getList();
	}

	@Override
	public List<boardVo> testcode() {
		
		return mapper.testcode();
	}

	@Override
	public List<boardVo> testcode2() {
		
		return mapper.testcode2();
	}

	@Override
	public List<boardVo> getList(criteria cri) {
		
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotalCount(criteria cri) {
		
		return mapper.getTotalCount(cri);
	}	
}
