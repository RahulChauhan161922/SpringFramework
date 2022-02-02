package com.spring.framework.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.framework.springmvc.model.User;

@Controller
@RequestMapping("/")
public class FormController {

	@RequestMapping("/loginform")
	public String loginForm(Model model) {
		System.out.println("Inside loginForm method");
		model.addAttribute("Header","User Form");
		return "form";
	}

	/*
	 * @RequestMapping(path = "/submit", method = RequestMethod.POST) public
	 * ModelAndView submit(@RequestParam String email, @RequestParam String
	 * password, @RequestParam Boolean check, ModelAndView model) {
	 * 
	 * System.out.println("Inside submit method");
	 * System.out.println("The email is " + email);
	 * System.out.println("The password is " + password);
	 * System.out.println("The checkbox is " + check); model.addObject("email",
	 * email); model.addObject("password", password); model.addObject("check",
	 * check); model.setViewName("formdata"); return model;
	 * 
	 * }
	 */

	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public ModelAndView submit(@ModelAttribute User user, ModelAndView model) {

		System.out.println("Inside submit method");
		System.out.println(user);
		model.addObject("user", user);
		model.setViewName("formdata");
		return model;

	}

}
