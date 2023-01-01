package com.icia.ttt.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.ttt.dto.MOVIE;
import com.icia.ttt.dto.MOVIELIKE;
import com.icia.ttt.dto.MOVIEPOST;
import com.icia.ttt.service.MVService;

@Controller
public class MVController {

	private ModelAndView mav = new ModelAndView();

	@Autowired
	private MVService mvsvc;

	@Autowired
	private HttpSession session;

	// csList : 영화 목록
	@RequestMapping(value = "/csMv", method = RequestMethod.GET)
	public ModelAndView csList() {

		mav = mvsvc.csList();

		return mav;
	}

	// mvList : 영화 목록
	@RequestMapping(value = "/allMv", method = RequestMethod.GET)
	public ModelAndView mvList() {

		mav = mvsvc.mvList();

		return mav;
	}

	// mvInfo :상세보기
	@RequestMapping(value = "/mvInfo", method = RequestMethod.GET)
	public ModelAndView mvInfo(@RequestParam("mv_Name") String mv_Name) {
		mav = mvsvc.mvInfo(mv_Name);
		System.out.println(mv_Name);
		return mav;
	}

	// 버퍼링 오류
	// mvLike : 영화 좋아요 추가
	@RequestMapping(value = "/mvLike", method = RequestMethod.GET)
	public ModelAndView mvLike(@ModelAttribute MOVIE movie) {
		System.out.println(movie);
		mav = mvsvc.mvLike(movie);
		return mav;
	}

	// mlCheck : 좋아요 아이디 일치.
	@RequestMapping(value = "/mlCheck", method = RequestMethod.POST)
	public @ResponseBody MOVIELIKE mlCheck(@ModelAttribute MOVIELIKE movieLike) {
		System.out.println(movieLike);
		MOVIELIKE mlCheck = mvsvc.mlCheck(movieLike);
		System.out.println(mlCheck);
		return mlCheck;
	}

	// movieLikeUp : 좋아요 올리기
	@RequestMapping(value = "/movieLikeUp", method = RequestMethod.POST)
	public @ResponseBody MOVIELIKE movieLikeUp(@ModelAttribute MOVIELIKE movieLike) {
		System.out.println(movieLike);
		MOVIELIKE movieLikeUp = mvsvc.movieLikeUp(movieLike);
		System.out.println(movieLikeUp);
		return movieLikeUp;
	}

	// movieLikeDown : 좋아요 내리기
	@RequestMapping(value = "/movieLikeDown", method = RequestMethod.POST)
	public @ResponseBody MOVIELIKE movieLikeDown(@ModelAttribute MOVIELIKE movieLike) {
		System.out.println(movieLike);
		MOVIELIKE movieLikeDown = mvsvc.movieLikeDown(movieLike);
		System.out.println(movieLikeDown);
		return movieLikeDown;
	}

	// movieLikeCount : 좋아요 갯수 보여주기
	@RequestMapping(value = "/movieLikeCount", method = RequestMethod.POST)
	public @ResponseBody int movieLikeCount(@ModelAttribute MOVIELIKE movieLike) {
		System.out.println(movieLike);
		int movieLikeCount = mvsvc.movieLikeCount(movieLike);
		System.out.println(movieLikeCount);
		return movieLikeCount;
	}

	// 예메율 1위
	@RequestMapping(value = "/mvRes", method = RequestMethod.GET)
	public ModelAndView mvRes(@ModelAttribute MOVIE movie) {
		mav = mvsvc.mvRes(movie);

		return mav;
	}
	
	// mpList
	@RequestMapping(value = "/mpList", method = RequestMethod.GET)
	public String mpList() {

		return "MV_PostForm";
	}
	
	// mvWrite : 게시글 등록
	@RequestMapping(value = "/mvWrite", method = RequestMethod.POST)
	public ModelAndView mvWrite(@ModelAttribute MOVIEPOST movie) throws IllegalStateException, IOException {
		System.out.println("게시글등록확인" + movie);
		mav = mvsvc.mvWrite(movie);

		System.out.println("controller mav:" + mav);
		return mav;
	}

	// mvView : 게시글 상세보기
	@RequestMapping(value = "/mvView", method = RequestMethod.GET)
	public ModelAndView mvView(@RequestParam("mp_Seq") int mpseq) {
		mav = mvsvc.mvView(mpseq);
		return mav;
	}

	// mvPost : 게시글 목록
	@RequestMapping(value = "/mvPost", method = RequestMethod.GET)
	public ModelAndView mvpostList() {
		mav = mvsvc.mvpostList();
		return mav;
	}

	// mvModifyForm : 게시글 수정페이지로 이동
	@RequestMapping(value = "/mvModifyForm", method = RequestMethod.GET)
	public ModelAndView mvModifyForm(@RequestParam("mp_Seq") int mp_Seq) {
		mav = mvsvc.mvModifyForm(mp_Seq);
		return mav;
	}

	// mvModify : 게시글 수정
	@RequestMapping(value = "/mvModify", method = RequestMethod.POST)
	public ModelAndView mvModify(@ModelAttribute MOVIEPOST movie) throws IllegalStateException, IOException {
		mav = mvsvc.mvModify(movie);
		return mav;
	}

	// mvDelete : 게시글 삭제
	@RequestMapping(value = "/mvDelete", method = RequestMethod.GET)
	public ModelAndView mvDelete(@RequestParam(value = "mp_Seq", required = true) int mp_seq) {
		mav = mvsvc.mvDelete(mp_seq);
		return mav;
	}
}
