package com.green.evalBbs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.green.evalBbs.dao.IEvalBbsDao;

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
	
	
}
