package com.student.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentServcie;

@Controller
public class StudentController {

	@Autowired
	private StudentServcie studentService;
	
	int sid = 101;
	
	
	@GetMapping("/register") // /register
	public String register() {
		return "registration";  //registration.jsp
	}
	
	@PostMapping("/registration") // /register
	public String registration(String name1, String name2, String b, String m, String e, ModelMap mMap) {
		
		
		
		Student student = new Student();
		
		
		student.setSid(sid);
		student.setFristName(name1);
		student.setLastName(name2);
		student.setBranch(b);
		student.setMobile(m);
		student.setEmail(e);
		
		mMap.put("studentname", name1);
		
		
		sid++;
		
		studentService.save(student);
		
		
		return "success";  //success.jsp
	}
	
	
	
	
	
	

	@RequestMapping("/get/{id}")
	@ResponseBody
	public Optional<Student> getStudent(@PathVariable int id) {
		return studentService.get(id);
	}

	@GetMapping("/getAll")
	@ResponseBody
	public List<Student> getStudent() {
		return studentService.getAll();
	}

	@PostMapping("/save")
	@ResponseBody
	public Student save(@RequestBody @Valid Student student) {
		return studentService.save(student);
	}

	@PutMapping("/update")
	@ResponseBody
	public Student udpate(@RequestBody Student student) {
		return studentService.udpate(student);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable int id) {
		studentService.delete(id);
	}

	@PostMapping("/register/reg") // /register
	public void register(String sid, String firstName, String lastName, String branch, String mobile, String email) {

		System.out.println("sid is :" + sid);
		System.out.println("firstName is :" + firstName);
		System.out.println("emai is :" + email);
	}

}
