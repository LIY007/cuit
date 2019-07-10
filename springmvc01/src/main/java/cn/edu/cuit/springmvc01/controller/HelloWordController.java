package cn.edu.cuit.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {

	@RequestMapping("/hw01")
	public String hw01() {
		return "hello1";
	}
	

}