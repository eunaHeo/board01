package com.board.domain;

import java.util.Date;

public class BoardVO {

/*
 create table tbl_board(
 	bno int not null auto_increment,
 	title varchar(50) not null,
 	content text not null,
 	writer varchar(30) not null,
 	regDate timestamp not null default now(),
 	wiewCnt int default 0,
 	primary key(bno)
 );
 */
	
	private int bno;
	private String title;
	private String content;
	private Date regDate;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	private int viewCnt;
	
	//Getter와 Setter가 있어야 VO의 데이터를 사용할 수 있다.
}