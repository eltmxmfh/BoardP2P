package com.boardP2P.P2PDAOImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boardP2P.P2PDAO.BoardDAOMV;
import com.boardP2P.P2PVO.BoardP2PVO;

@Repository
public class BoardDAOMVImpl implements BoardDAOMV{
	
	@Autowired
	private SqlSession mybatis;
	
	
	public void insertBoard(BoardP2PVO vo) {
		System.out.println("<=== insert 备巩 角青 ===>");
		mybatis.insert("BoardMVQuery.insertBoard", vo);
		
	}

	
	public void updateBoard(BoardP2PVO vo) {
		System.out.println("<=== update 备巩 角青 ===>");
		mybatis.update("BoardMVQuery.updateBoard", vo);
	}

	
	public void deleteBoard(BoardP2PVO vo) {
		System.out.println("<=== delete 备巩 角青 ===>");
		mybatis.delete("BoardMVQuery.deleteBoard", vo);
	}

	
	public BoardP2PVO getBoard(BoardP2PVO vo) {
		System.out.println("<=== getBoard 备巩 角青 ===>");
		
		return (BoardP2PVO) mybatis.selectOne("BoardMVQuery.getBoardBoard", vo);
	}

	
	public List<BoardP2PVO> getBoardList(BoardP2PVO vo) {
		System.out.println("<=== getBoardList 备巩 角青 ===>");
		return mybatis.selectList("BoardMVQuery.getBoardList", vo);
	}
	
}
