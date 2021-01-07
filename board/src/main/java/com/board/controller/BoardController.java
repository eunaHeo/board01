package com.board.controller;
//board/list.jsp를 이동할 컨트롤을 하지 않으면 404에러창이 뜨면서 접근할 수 없다.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*import com.board.dao.BoardDAO;*/
import com.board.domain.BoardVO;
/*import com.board.service.BoardService;*/

@Controller
@RequestMapping("/board/*")

public class BoardController {
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void getList() {
		
	}
}
