package com.vueSpring.board_project.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BoardVO {

    private int bno; //게시글 번호
    private String title; //게시글 제목
    private String content; //게시글 내용
    private String loginID; // 글쓴이
    private Date regdate; //등록일
    private int vcount;//게시글 조회수
}
