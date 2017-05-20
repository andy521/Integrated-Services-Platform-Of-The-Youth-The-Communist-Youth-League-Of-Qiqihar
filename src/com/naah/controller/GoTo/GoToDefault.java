package com.naah.controller.GoTo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoToDefault {

	@RequestMapping("default.naah")
	public String Index()
	{
		return "default";
	}
}
