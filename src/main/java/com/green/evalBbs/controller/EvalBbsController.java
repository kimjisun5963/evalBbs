package com.green.evalBbs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

@Controller
public class EvalBbsController {

	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@RequestMapping("/list")
	public String getList(Model model) {
		
		model.addAttribute("list", dao.getList());
		
		return "list";
	}
	
	@RequestMapping("/detail")
	public String getDto(HttpServletRequest request, int bno, Model model) {
		
		String bnos = request.getParameter("bno");
		int bnoi = Integer.parseInt(bnos);
	    model.addAttribute("dto", dao.getDto(bnoi));	
		
		return "detail";
	}
	
	@RequestMapping("/delete")
	public String deletDto(@RequestParam("bno") String bnos) {
		int bno = Integer.parseInt(bnos);
		dao.deleteDto(bno);
		
		return "redirect:list";
	}
	
	@RequestMapping("/writeForm")
	public String writeDto() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(EvalBbsDto evalBbsDto) {
		dao.regDto(evalBbsDto.getTitle(), evalBbsDto.getContent(), evalBbsDto.getWriter());
		return "redirect:list";
	}
	
}
