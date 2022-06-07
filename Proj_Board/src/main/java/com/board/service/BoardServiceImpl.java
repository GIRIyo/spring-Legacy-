package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;
import com.board.model.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void enroll(BoardVo board) {
		
		mapper.enroll(board);
	}
	@Override
	public List<BoardVo> getList() {
	        
	        return mapper.getList();
	  }
	@Override
	public BoardVo getPage(int bno) {
		return mapper.getPage(bno);
	}
}	
