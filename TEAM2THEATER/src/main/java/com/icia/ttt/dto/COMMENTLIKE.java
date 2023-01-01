package com.icia.ttt.dto;

import lombok.Data;

@Data	
public class COMMENTLIKE {
	private String cl_CmtId;	//댓글 단 아이디 
	private String cl_Movie;	// 댓글 단 영화제목
	private String cl_Id;	// 좋아요 누른 아이디
	private String cl_Check; // 아이디 체크 
	private int cl_Num;	//좋아요 갯수
}
