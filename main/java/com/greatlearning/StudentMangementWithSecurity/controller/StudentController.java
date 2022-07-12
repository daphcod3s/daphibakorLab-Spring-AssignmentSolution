package com.greatlearning.StudentMangementWithSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.greatlearning.StudentMangementWithSecurity.model.Student;
import com.greatlearning.StudentMangementWithSecurity.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/printstudents")
	public String printStudents(Model theModel){
		
		List<Student> students = studentService.searchAll();
		theModel.addAllAttributes(students);
		return "list-Student";
		
	}
	
	@PostMapping("/saveForm")
	public String saveStudent(@RequestParam ("firstname") String fname, @RequestParam ("lastname") String lname, @RequestParam ("course") String course, @RequestParam ("country") String country ){
		//save the record in DB
		Student studentObj = new Student();
		studentObj.setFirstname(lname);
		studentObj.setLastname(lname);
		studentObj.setCourse(course);
		studentObj.setCountry(country);
		studentService.save(studentObj);
		
	
		//return to list page
		return "redirect:/printstudents";
	}
	
//	public String updateStudent(@RequestParam ("firstname") String fname, @RequestParam ("lastname") String lname, @RequestParam ("course") String course, @RequestParam ("country") String country ){
//		//save the record in DB
//		
//		
//		//return to list page
//		return "redirect:/printstudents";
//	}
}
