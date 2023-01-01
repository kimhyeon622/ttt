package com.icia.ttt.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.ttt.dao.CDAO;
import com.icia.ttt.dao.TRDAO;
import com.icia.ttt.dto.THEATER;

@Service
public class TRService {
	
	private THEATER theater = new THEATER();
	
	@Autowired
	private TRDAO trdao;
	
	@Autowired
	private HttpSession session;

	@Autowired
	private HttpServletRequest request;
	
	// 극장 정보 불러오기 
	public List<THEATER> trInfo(THEATER theater) {

		List<THEATER> theaterList = trdao.trInfo(theater);
		System.out.println(theaterList);
		
		return theaterList;
	}

	public List<THEATER> trDate(THEATER theater) {
		
		List<THEATER> theaterList = trdao.trDate(theater);
		System.out.println(theaterList);
		
		return theaterList;
	}

}
