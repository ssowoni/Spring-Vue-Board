package com.vueSpring.board_project.board.service;

import com.vueSpring.board_project.board.dao.BoardDao;
import com.vueSpring.board_project.board.domain.BoardVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{


    private BoardDao boardDao;

    public List<BoardVO> getList(){
        return boardDao.selectList();
    }

}
