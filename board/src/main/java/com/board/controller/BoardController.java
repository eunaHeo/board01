package com.board.controller;
import java.util.List;

import javax.inject.Inject;

//board/list.jsp를 이동할 컨트롤을 하지 않으면 404에러창이 뜨면서 접근할 수 없다.
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
@RequestMapping("/board/*")

public class BoardController {
	
	@Inject
	BoardService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList(Model model) throws Exception {
		
		List<BoardVO> list = null;
		list = service.list();
		
		model.addAttribute("list",list);
		
	}
	
	//게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWirte() throws Exception {
		
	}
	
	//게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String posttWirte(BoardVO vo) throws Exception {
		service.write(vo);
		
		return "redirect:/board/list"; //모든 작업을 마치고 /board/list 즉 게시물 목록 화면으로 이동하겠다는 의미
	
	}
	
	//게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("bno") int bno, Model model) throws Exception{
		
		BoardVO vo = service.view(bno);//게시물의 번호를 받아야한다.
		
		model.addAttribute("view", vo); 
		
	}
}
