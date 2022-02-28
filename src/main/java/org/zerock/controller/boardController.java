package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.boardVo;
import org.zerock.domain.criteria;
import org.zerock.domain.pageDTO;
import org.zerock.service.boardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
@Log4j
public class boardController {
	
	private final boardService service;
	
	/*
	 * @GetMapping("/list") public void list(Model model) {
	 * 
	 * log.info("list..... 리스트 조회시작dddddd");
	 * 
	 * model.addAttribute("list", service.getList());
	 * 
	 * }
	 */
	
	@GetMapping("/list")
	public void list(criteria cri, Model model) {
		
		log.info("-----------test");
		log.info(cri);
		log.info("list..... 리스트 조회시작");
		
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new pageDTO(cri, 123));
		
	}
	
	@GetMapping("/register")
	public void registerGet() {
		
	}
	
	
	@PostMapping("/register")
	public String register(boardVo vo, RedirectAttributes rttr) {
		
		log.info("board........................" + vo);
		
		Long bno = service.register(vo);
		
		log.info("bno........................" + bno);
		
		// 페이지 이동시 데이터를 보낼때 방법이 2가지가 있다.
		rttr.addFlashAttribute("result", bno);
//		rttr.addAttribute("result", bno);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/testcode")
	public void testcode(Model model) {
		
		log.info("testcode.....");
		
		model.addAttribute("testcode", service.testcode());
		
	}
	
	@GetMapping("/testcode2")
	public void testcode2(Model model) {
		
		model.addAttribute("testcode2", service.testcode2());
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno")long bno,@ModelAttribute("cri") criteria cri , Model model) {
		
		model.addAttribute("board", service.get(bno));
		
	}
	
	
	@PostMapping("/modify")
	public String modify(boardVo vo, RedirectAttributes rttr) {
		
		int count = service.modify(vo);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove") 
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
	
		int count = service.remove(bno);
		
		if(count == 1) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
}