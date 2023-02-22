DROP SEQUENCE BNOSEQ;
DROP TABLE BOARD;

CREATE SEQUENCE BNOSEQ;

CREATE TABLE BOARD(
                      bno number primary key,
                      title varchar2(200),
                      content varchar2(2000),
                      loginID varchar2(50),
                      regdate date default sysdate,
                      vcount number
);

insert into board (bno, title, content, loginID, vcount)
values(bnoseq.nextval, '테스트 제목' , '테스트 내용','user00' ,0);

insert into board (bno, title, content, loginID, vcount)
values(bnoseq.nextval, '테스트 제목' , '테스트 내용','user01' ,0);

insert into board (bno, title, content, loginID, vcount)
values(bnoseq.nextval, '테스트 제목' , '테스트 내용','user02' ,0);

select * from board;