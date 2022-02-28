package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.boardVo;
import org.zerock.domain.criteria;
import org.zerock.domain.pageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class boardMapperTests {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		log.info("getList TEST");
		boardMapper.getList();
	}
	
	@Test
	public void testinsert() {
		
		boardVo vo = new boardVo();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트 ");
		vo.setWriter("tester 테스터");
		
		boardMapper.insert(vo);
		log.info("-------------------");
		log.info("after insert : " + vo.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		
		boardVo vo = new boardVo();
		vo.setTitle("aaa 테스트");
		vo.setContent("bbb 테스트 ");
		vo.setWriter("ccc 테스터");
		
		boardMapper.insertSelectkey(vo);

		log.info("-------------------");
		log.info("after insertkey : " + vo.getBno());
	}
	
	@Test
	public void testRead() {
		
		boardVo vo = boardMapper.read(9L);
		log.info(vo);
		
	}
	
	@Test
	public void testdelete() {
		
		int count = boardMapper.delete(1L);
		
		log.info(count);
	}
	
	
	// update나 delete의 경우는 return 값을 받아서 사용하는것이 좋다
	@Test
	public void testUpload() {
		
		boardVo vo = new boardVo();
		vo.setBno(8L);
		vo.setTitle("updated title");
		vo.setContent("update content");
		vo.setWriter("user00");
		
		log.info("count : " + boardMapper.upload(vo));		
	}
	
	@Test
	public void testpaging() {
		
		// 1 페이지 10개 데이터
		criteria cri = new criteria();
		
		List<boardVo> list = boardMapper.getListWithPaging(cri);
		
		list.forEach(b -> log.info(b));
		
	}
	
	@Test
	public void testpageDTO() {
		
		criteria cri = new criteria();
		cri.setPageNum(21);
		
		pageDTO pageDTO = new pageDTO(cri, 251);
		
		log.info(pageDTO);
		
	}
	
	
}
