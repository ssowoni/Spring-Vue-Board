package com.vueSpring.board_project.board.service;

import com.vueSpring.board_project.board.dao.BoardDao;
import com.vueSpring.board_project.board.domain.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class BoardServiceImpl implements BoardService{


    private BoardDao boardDao;

    public List<BoardVO> getList(){
        log.info("service ==================== list");
        return boardDao.selectList();
    }

}
