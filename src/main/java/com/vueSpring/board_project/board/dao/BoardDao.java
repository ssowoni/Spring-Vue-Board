package com.vueSpring.board_project.board.dao;

import com.vueSpring.board_project.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    public List<BoardVO> selectList();
}
