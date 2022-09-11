package com.student.enrollment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.enrollment.model.StudentEnrollmentDetails;
import com.student.enrollment.service.EnrollmentService;

@RestController
@RequestMapping("/student")
public class EnrollmentController {
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	
	@PostMapping("/entrollment")
	public String entrollment(@RequestBody StudentEnrollmentDetails studentDetails) {
		
		return enrollmentService.enrollment(studentDetails);
	}
	
	
	@GetMapping("/studentInfo/{id}/{test}")
	public Optional<StudentEnrollmentDetails> getStudentInfo(Integer id) {
		
		return enrollmentService.getStudentInfo(id);
		
		
	}

	@GetMapping("/studentInfo/{name}")
	public String test(String name) {
		
		return "My name is Dinesh";
		
	}
	
	@GetMapping("/company")
	public String test2() {
		
		return "am working tavant";
	}
}
