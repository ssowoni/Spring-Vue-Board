package com.vueSpring.board_project.board.service;

import com.vueSpring.board_project.board.dao.BoardDao;
import com.vueSpring.board_project.board.domain.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BoardService {

    public List<BoardVO> getList();

}
