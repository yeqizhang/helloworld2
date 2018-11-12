
package com.tgc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tgc.entity.User;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
		//http://localhost:8080/helloworld/index
	}
	
	/**
	 * 使用jstl
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView  list() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("nodb");
		user.setId(66);
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		return mav;
		//http://localhost:8080/helloworld/list
	}

}
