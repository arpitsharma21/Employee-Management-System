package com.smart.controller;

import java.io.Console;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.entites.Employee;
import com.smart.service.EmpService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addemp")
	public String  addEmpForm() {
		System.out.println("Employee adding");
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session) {
		
		service.addEmp(e);
		session.setAttribute("msg", "Employee Added Successfully");
		return "add_emp";
	}
	
	@GetMapping("/view")
	public String updateEmp(Model m) {
		 List<Employee> empl= service.getAllEmp();
		 m.addAttribute("emp",empl);
		return "view";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee e = service.getEmpById(id);
		m.addAttribute("emp", e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute Employee e,HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Emp Data updated sucessfully");
		return "view" ;
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEMp(@PathVariable int id, HttpSession session) {

		service.deleteEmp(id);
		session.setAttribute("msg", "Emp Data Delete Sucessfully..");
		return "home";
	}
	
	@GetMapping("/leave")
	public String leave() {
		System.out.println("Checking leave");
		return "leavewithemail";
	}
	
	
}
