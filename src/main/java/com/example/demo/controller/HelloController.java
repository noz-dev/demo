package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	//https://tech-blog.rakus.co.jp/entry/20201110/java
    @RequestMapping("/hello")
	public String index() {
		return "hello";
	}


}