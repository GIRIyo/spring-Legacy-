package com.board.mapper;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.BoardVo;
import com.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
 
     private static final Logger log = LoggerFactory.getLogger(BoardMapperTest.class);
     
     @Autowired
     private BoardService service;
 
     @Test
     public void testEnroll() {
         
         BoardVo vo = new BoardVo();
         
         vo.setTitle("service test");
         vo.setContent("mapper test");
         vo.setWriter("mapper test");
         
        service.enroll(vo);
         
     }
}
