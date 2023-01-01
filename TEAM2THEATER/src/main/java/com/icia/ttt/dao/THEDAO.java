package com.icia.ttt.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.ttt.dto.MOVIE;
import com.icia.ttt.dto.RESERVATION;
import com.icia.ttt.dto.THEATER;

@Repository
public class THEDAO {

	@Autowired
	SqlSessionTemplate sql;

	public List<THEATER> theList(THEATER theater) {
		System.out.println("DAO theater : " + theater);
		return sql.selectList("Theater.theList", theater);
	}

	public THEATER seetTheater(String code) {
		return sql.selectOne("Theater.seetTheater", code);
	}

	public List<RESERVATION> setColor(RESERVATION res) {
		return sql.selectList("Theater.setColor", res);
	}

	public int doPay(RESERVATION res) {
		return sql.insert("Theater.dopay", res);
	}




	
}
