package fr.allianz.t2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	String message = "Welcome to your 1st Maven Spring project !";

	@RequestMapping("/hello")
	public ModelAndView showMessage() {
		System.out.println("from controller");
		return new ModelAndView("hello", "message", message);
	}

}
