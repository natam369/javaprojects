package com.mindtree.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping("/")
	   public String index() {
	      return "index";
	   }

	@PostMapping("/sample")
	   public String sayHello(@RequestParam("name") String name, Model model) {
		System.out.println("sayhello");
	      model.addAttribute("name", name);
	      return "Sample";
	   }
	
}
