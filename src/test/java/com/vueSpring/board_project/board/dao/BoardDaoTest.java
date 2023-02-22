package com.vueSpring.board_project.board.dao;

import com.vueSpring.board_project.board.domain.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class BoardDaoTest {



    BoardDao boardDao;

    public BoardDaoTest(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Test
    void getList(){

        List<BoardVO> list = boardDao.selectList();
        int size = list.size();

        Assertions.assertThat(size).isEqualTo(6);

    }
}