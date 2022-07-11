package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.dto.DepartmentDto;
import com.springboot.service.DepartmentService;


@Controller
@RequestMapping("/home")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping
	public String openDepartmentPage(Model model) {
		model.addAttribute("departmentDto", new DepartmentDto());
		return "/home";
	}
	@PostMapping
	public String saveDepartment(@ModelAttribute DepartmentDto departmentDto, RedirectAttributes redirectAttributes) {
		String message="";
		departmentDto = departmentService.saveDepartment(departmentDto);
		if(departmentDto == null) {
			message = "Department cannot be saved";
		}else {
			message = "Department created successfully";
		}
		redirectAttributes.addFlashAttribute("message", message);
		return "redirect:/home";
	}

}
