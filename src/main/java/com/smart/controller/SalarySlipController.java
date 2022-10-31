package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class SalarySlipController {
	@GetMapping("/salaryslip")
	public String getClient(){
		return  "salaryslip";
	}
	

}
