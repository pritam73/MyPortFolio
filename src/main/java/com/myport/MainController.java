package com.myport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

	@GetMapping("/")
	public String mainPage() {
		System.err.println("::: MainController.mainPage :::");
		return "userHomePage";
	}
}
