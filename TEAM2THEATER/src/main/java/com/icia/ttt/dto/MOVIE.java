package com.icia.ttt.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MOVIE {
	private String mv_Name; 		//영화이름
	private String mv_Head;			//소개글 머릿글
	private String mv_Content;		//소개글 전체
	private String mv_Director;		//감독
	private String mv_Actor;		//배우
	private String mv_Type;			//상영타입
	private String mv_Genre;		//장르
	private String mv_Review;		//예고편 주소
	private String mv_Age;			//등급(all/나이)
	private String mv_PosterName;	// 영화 포스터 이름
	
	private int mv_Res;				//예매율
	private int mv_Aud;				//누적관객수
	private int mv_Time;			//총시간
	private int mv_Point;			//평점
	private int mv_Like;			//좋아요
	private int mv_Notice;			// 상영예정 여부
	
	private Date mv_Openday;		//개봉일자
	
}
