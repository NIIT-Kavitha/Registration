package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {
	
@RequestMapping("/")
public String index()
{
	return "index";
}

@RequestMapping(value = "/register")
public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) {
  ModelAndView m = new ModelAndView("Registration");
  m.addObject("user", new User());
  return m;
}

}
