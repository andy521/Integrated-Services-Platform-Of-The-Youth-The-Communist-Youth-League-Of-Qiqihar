package com.naah.controller.GoTo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoToIndex
{

	@RequestMapping("index.naah")
	public String Index()
	{
		return "index";
	}

}
