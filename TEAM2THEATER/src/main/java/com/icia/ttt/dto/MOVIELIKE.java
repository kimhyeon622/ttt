package com.icia.ttt.dto;

import lombok.Data;

@Data
public class MOVIELIKE {
	private String ml_Movie; // 좋아요 할 영화
	private String ml_Id;	// 좋아요 한 아이디
	private String ml_Check; // 아이디 체크 
}
