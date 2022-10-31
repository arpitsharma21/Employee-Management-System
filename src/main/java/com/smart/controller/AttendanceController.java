package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.smart.entites.Attendance;
import com.smart.service.AttendanceService;

@Controller
public class AttendanceController {
	
	@Autowired
	private AttendanceService service;

	@GetMapping("/attendance")
	public String attendance() {
		return "attendance";
	}
	
	@PostMapping("/attendance/process")
	public String fillAttendance(@ModelAttribute Attendance a){
		System.out.println("Checking Attendance");
		this.service.saveAttendance(a);
		return "home";
	}
}
