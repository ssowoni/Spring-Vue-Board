package com.vueSpring.board_project.board.service;

import com.vueSpring.board_project.board.domain.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@AllArgsConstructor
class BoardServiceImplTest {

    BoardServiceImpl boardService;

    @Test
    void getList(){
        List<BoardVO> list = boardService.getList();
        list.forEach(board -> System.out.println("list = " + list.toString()));

    }





}