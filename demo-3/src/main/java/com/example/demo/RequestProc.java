package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestProc {

	@RequestMapping(value="/")
	public  ModelAndView index() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "こんにちは、お元気ですか");
		mav.setViewName("NewFile.html");

		return mav;

	}

	@RequestMapping(value="/some")
	public String some() {

		return "NewFile.html";
	}
}