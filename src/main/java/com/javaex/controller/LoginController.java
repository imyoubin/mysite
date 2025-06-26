package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

		//필드
	
		//생성자
		
		//메소드gs
		
		//메소드일반
		@RequestMapping(value="/user/loginform", method= {RequestMethod.GET, RequestMethod.POST})
		public String index() {
			System.out.println(" LoginController.index()");
			
			return "user/loginform";
		}

	

}
