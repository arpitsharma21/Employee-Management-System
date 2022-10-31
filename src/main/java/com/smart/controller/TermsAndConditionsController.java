package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class TermsAndConditionsController {
	@GetMapping("/TermsAndConditions")
	public String getClient(){
		return  "TermsAndConditions";
	}
	

}
