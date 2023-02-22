package com.vueSpring.board_project.board.controller;

import com.vueSpring.board_project.board.domain.BoardVO;
import com.vueSpring.board_project.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/board")
@RestController
public class BoardController {

    private BoardService boardService;

    @GetMapping("/list")
    public List<BoardVO> getList(){
        return boardService.getList();
    }


}
