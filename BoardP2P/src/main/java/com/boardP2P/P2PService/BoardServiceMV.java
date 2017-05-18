package com.boardP2P.P2PService;

import java.util.List;

import com.boardP2P.P2PVO.BoardP2PVO;

public interface BoardServiceMV {
	void insertBoard(BoardP2PVO vo);
	void updateBoard(BoardP2PVO vo);
	void deleteBoard(BoardP2PVO vo);
	BoardP2PVO getBoard(BoardP2PVO vo);
	List<BoardP2PVO> getBoardList(BoardP2PVO vo);
}
