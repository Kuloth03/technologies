package com.Technologies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnologiesController {

	@GetMapping(value="/get")
	public String method()
	{
		return "hiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
	}
}
