package com.icia.ttt.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.ttt.dao.CDAO;
import com.icia.ttt.dto.COMMENT;
import com.icia.ttt.dto.COMMENTLIKE;

@Service
public class CService {

	private ModelAndView mav = new ModelAndView();

	@Autowired
	private CDAO cdao;

	@Autowired
	private HttpSession session;

	@Autowired
	private HttpServletRequest request;
	
	COMMENTLIKE cmtLikeCheck = new COMMENTLIKE();
	
	public List<COMMENT> cList(String cmt_Mvname) {
		
		List<COMMENT> commentList = cdao.cList(cmt_Mvname);
		
		return commentList;
	}


	public List<COMMENT> cmtWrite(COMMENT comment) {
		List<COMMENT> commentList = null;
		
		int result = cdao.cmtWrite(comment);
		
		if(result > 0) {
			commentList = cdao.cList(comment.getCmt_Mvname());
		}else {
			commentList = null;
		}
		
		return commentList;
	}


	public List<COMMENT> cmtDelete(COMMENT comment) {
		List<COMMENT> commentList = null;
		
		int result = cdao.cmtDelete(comment);
		
		if(result > 0) {
			commentList = cdao.cList(comment.getCmt_Mvname());
		}else {
			commentList = null;
		}
		
		return commentList;
	}
	
	public List<COMMENT> cmtModify(COMMENT comment) {
		List<COMMENT> commentList = null;
		
		int result = cdao.cmtModify(comment);
		
		if(result > 0) {
			commentList = cdao.cList(comment.getCmt_Mvname());
		}else {
			commentList = null;
		}
		return commentList;
	}


	public COMMENTLIKE cmtLikeCheck(COMMENTLIKE commentLike) {
		
		String clCheck = cdao.cmtLikeCheck(commentLike);
		
		if(commentLike.getCl_Id().equals(null)) {
			return cmtLikeCheck;
		}
		System.out.println("cmtLikeCheck : ");
		System.out.println(clCheck);
		
		if(clCheck == null) {	// 좋아요를 안눌렀을 때
			cmtLikeCheck.setCl_Check("OK");
			int Up =cdao.cmtLikeUp(commentLike); // 좋아요 눌러주기
			cmtLikeCheck.setCl_Num(cdao.cmtLikeNum(commentLike));	//좋아요 갯수 구하기
			cmtLikeCheck.setCl_CmtId(commentLike.getCl_CmtId());
		}else {					// 좋아요를 눌렀을 때
			cmtLikeCheck.setCl_Check("NO");
			int Down =cdao.cmtLikeDown(commentLike); // 좋아요 내리기
			cmtLikeCheck.setCl_Num(cdao.cmtLikeNum(commentLike));	//좋아요 갯수 구하기
			cmtLikeCheck.setCl_CmtId(commentLike.getCl_CmtId());
		}

		
		return cmtLikeCheck;
	}

	// 좋아요 보여주기
	public COMMENTLIKE cmtLikeCheckBefore(COMMENTLIKE commentLike) {
		
		String clCheck = cdao.cmtLikeCheck(commentLike);
		System.out.println(clCheck);
		
		if(clCheck == null) {	// 좋아요를 안눌렀을 때
			cmtLikeCheck.setCl_Check("OK");
			cmtLikeCheck.setCl_Num(cdao.cmtLikeNum(commentLike));	//좋아요 갯수 구하기
			cmtLikeCheck.setCl_CmtId(commentLike.getCl_CmtId());
		}else {					// 좋아요를 눌렀을 때
			cmtLikeCheck.setCl_Check("NO");
			cmtLikeCheck.setCl_Num(cdao.cmtLikeNum(commentLike));	//좋아요 갯수 구하기
			cmtLikeCheck.setCl_CmtId(commentLike.getCl_CmtId());
		}
		return cmtLikeCheck;
	}
}
