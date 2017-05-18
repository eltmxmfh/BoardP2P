package com.boardP2P.P2PServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardP2P.P2PDAO.BoardDAOMV;
import com.boardP2P.P2PService.BoardServiceMV;
import com.boardP2P.P2PVO.BoardP2PVO;

@Service("boardServiceMv")
public class BoardServiceMVImpl implements BoardServiceMV{
	
	@Autowired
	private BoardDAOMV boardmv;
	
	public void insertBoard(BoardP2PVO vo) {
		boardmv.insertBoard(vo);
		
	}

	
	public void updateBoard(BoardP2PVO vo) {
		boardmv.updateBoard(vo);
		
	}

	
	public void deleteBoard(BoardP2PVO vo) {
		boardmv.deleteBoard(vo);
		
	}

	
	public BoardP2PVO getBoard(BoardP2PVO vo) {
		return boardmv.getBoard(vo);
	}

	
	public List<BoardP2PVO> getBoardList(BoardP2PVO vo) {
		return boardmv.getBoardList(vo);
	}

}
