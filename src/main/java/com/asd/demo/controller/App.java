package com.asd.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asd.demo.service.TestService;

/**
 * Hello world!
 *
 */

@Controller
public class App {

	@Autowired
	private TestService testService;

	@RequestMapping("test")
	@ResponseBody
	public String test(String input) {
		return input + "!";
	}

	@RequestMapping("test2")
	@ResponseBody
	public String test2(String input){
		return testService.test2(input);
	}

}
