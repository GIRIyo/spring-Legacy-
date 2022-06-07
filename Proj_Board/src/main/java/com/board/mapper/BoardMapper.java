package com.board.mapper;

import java.util.List;

import com.board.model.BoardVo;

public interface BoardMapper {
	
	 public void enroll(BoardVo board);
	 
	 public List<BoardVo> getList();
	 
	 public BoardVo getPage(int bno);
	 
}
