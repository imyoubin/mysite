package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaex.service.UserService;
import com.javaex.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	// 회원가입 폼
	@GetMapping("/joinform")
	public String joinForm() {
		System.out.println("UserController.joinForm()");
		return "user/joinform";
	}

	// 회원가입
	@PostMapping("/join")
	public String join(@ModelAttribute UserVO userVO) {
		System.out.println("UserController.join()");
		userService.exeJoin(userVO);
		return "user/join"; 
	}
}