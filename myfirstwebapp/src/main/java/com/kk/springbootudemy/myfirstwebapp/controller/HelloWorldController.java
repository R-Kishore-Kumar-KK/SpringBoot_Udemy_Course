package com.kk.springbootudemy.myfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/say-hello")
	@ResponseBody
	public String getHelloWorldMessage() {
		return "Hello World Printed!!!!";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String getHelloWorldMessagewithhtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First HTML Page using Spring Boot Hardcoded");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	@RequestMapping("/say-hello-jsp")
	public String getHelloWorldMessagewithJsp() {
		return "sayHello";
	}
}
