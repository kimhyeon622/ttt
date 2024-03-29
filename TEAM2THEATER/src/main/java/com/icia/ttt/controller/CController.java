package com.icia.ttt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icia.ttt.dto.COMMENT;
import com.icia.ttt.dto.COMMENTLIKE;
import com.icia.ttt.service.CService;

@Controller
@RequestMapping("/comment")
public class CController {

	@Autowired
	private CService csvc;

	// 댓글 보기
	@RequestMapping(value = "/cList", method = RequestMethod.POST)
	public @ResponseBody List<COMMENT> cList(@RequestParam("cmt_Mvname") String cmt_Mvname) {
		System.out.println(cmt_Mvname);
		List<COMMENT> commentList = csvc.cList(cmt_Mvname);
		System.out.println(cmt_Mvname);
		return commentList;
	}

	// cmtWrite : 댓글 작성
	@RequestMapping(value = "/cmtWrite", method = RequestMethod.POST)
	public @ResponseBody List<COMMENT> cmtWrite(@ModelAttribute COMMENT comment) {
		System.out.println(comment);
		List<COMMENT> commentList = csvc.cmtWrite(comment);
		System.out.println("cmtWrite  " + comment);
		return commentList;
	}

	// cmtDelete : 댓글 삭제
	@RequestMapping(value = "/cmtDelete", method = RequestMethod.POST)
	public @ResponseBody List<COMMENT> cmtDelete(@ModelAttribute COMMENT comment) {
		System.out.println("cmtDelete  " + comment);
		List<COMMENT> commentList = csvc.cmtDelete(comment);
		return commentList;
	}

	// cmtModify : 댓글 수정
	@RequestMapping(value = "/cmtModify", method = RequestMethod.POST)
	public @ResponseBody List<COMMENT> cmtModify(@ModelAttribute COMMENT comment) {
		List<COMMENT> commentList = csvc.cmtModify(comment);
		System.out.println("cmtModify  " + comment);
		return commentList;
	}

	// cmtLikeCheck : 좋아요 한 사람인지 아닌지 처리
	@RequestMapping(value = "/cmtLikeCheck", method = RequestMethod.POST)
	public @ResponseBody COMMENTLIKE cmtLikeCheck(@ModelAttribute COMMENTLIKE commentLike) {
		System.out.println(commentLike);
		COMMENTLIKE cmtLikeCheck = csvc.cmtLikeCheck(commentLike);
		System.out.println("cmtLikeCheck  " + cmtLikeCheck);
		return cmtLikeCheck;
	}

	// cmtLikeCheckBefore : 좋아요 누르기 전
	@RequestMapping(value = "/cmtLikeCheckBefore", method = RequestMethod.POST)
	public @ResponseBody COMMENTLIKE cmtLikeCheckBefore(@ModelAttribute COMMENTLIKE commentLike) {
		System.out.println("cmtLikeCheckBefore" + commentLike);
		COMMENTLIKE cmtLikeCheck = csvc.cmtLikeCheckBefore(commentLike);

		return cmtLikeCheck;
	}

}
