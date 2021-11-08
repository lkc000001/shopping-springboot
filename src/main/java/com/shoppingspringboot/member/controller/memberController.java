package com.shoppingspringboot.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoppingspringboot.base.model.BaseModel;
import com.shoppingspringboot.db.model.Member;

@Controller
@RequestMapping(value = "/member")
public class memberController {

	@PostMapping(value = "/insertMember" ,produces = "application/json")
	public @ResponseBody BaseModel insertMember(HttpSession httpsession ,HttpServletRequest request ,
			HttpServletResponse resp ,@RequestBody Member member){
		
		BaseModel res = new BaseModel();
		
		return res;
	}
	
	@GetMapping(value = "/questMember" ,produces = "application/json")
	public @ResponseBody BaseModel questMember(HttpSession httpsession ,HttpServletRequest request ,
			HttpServletResponse resp ,@RequestBody Member member){
		
		BaseModel res = new BaseModel();
		
		return res;
	}
	
}
