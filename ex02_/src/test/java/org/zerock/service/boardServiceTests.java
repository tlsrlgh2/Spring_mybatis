package org.zerock.service;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.boardVo;
import org.zerock.mapper.boardMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class boardServiceTests {

	@Autowired
	private boardService service;

	@Test
	public void testPrint() {
		
		log.info(service);
		
	}
	
	@Test
	public void testGetlist() {
		
		service.getlList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testRegister() {
		
		boardVo vo = new boardVo();
		vo.setTitle("test 테스트");
		vo.setContent("content 테스트 ");
		vo.setWriter("tester 테스터");
		
		long bno = service.register(vo);
		
		log.info("bno" + bno);
		
	}

}
