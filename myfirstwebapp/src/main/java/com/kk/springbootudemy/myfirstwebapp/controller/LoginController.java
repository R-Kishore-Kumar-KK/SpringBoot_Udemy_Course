package com.kk.springbootudemy.myfirstwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/login")
	public String getLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Request Param: " + name);
		logger.info("Request Param: " + name);
		return "login";
	}
}
