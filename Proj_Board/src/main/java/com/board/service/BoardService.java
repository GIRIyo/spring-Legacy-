package com.board.service;

import java.util.List;

import com.board.model.BoardVo;

public interface BoardService {

	 public void enroll(BoardVo board);
	 
	 public List<BoardVo> getList();
	 
	 public BoardVo getPage(int bno);
	 
	 public int modify(BoardVo board);
}
