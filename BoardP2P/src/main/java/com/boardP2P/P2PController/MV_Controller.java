package com.boardP2P.P2PController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boardP2P.P2PService.BoardServiceMV;
import com.boardP2P.P2PVO.BoardP2PVO;


@Controller
public class MV_Controller {
	
	@Autowired
	private BoardServiceMV boardServiceMv;
	
	@RequestMapping(value="")
	public String insert(BoardP2PVO vo){
		boardServiceMv.insertBoard(vo);
		return null;
	}
	
	public String update(@ModelAttribute("boardmv") BoardP2PVO vo){
		boardServiceMv.updateBoard(vo);
		return null;
	}
	
	public String delete(BoardP2PVO vo){
		boardServiceMv.deleteBoard(vo);
		return null;
	}
	
	public BoardP2PVO getBoard(Model model, BoardP2PVO vo, HttpServletRequest request){
		model.addAttribute("boardmv",boardServiceMv.getBoard(vo));
		return null;
	}
	
	public List<BoardP2PVO> getBoardList(Model model, BoardP2PVO vo){
		model.addAttribute("boardmv",boardServiceMv.getBoardList(vo));
		return null;
	}
}
