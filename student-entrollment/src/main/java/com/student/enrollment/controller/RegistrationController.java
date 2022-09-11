package com.student.enrollment.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.enrollment.model.StudentRegistrationDetails;
import com.student.enrollment.service.RegistrationService;

@RestController
@RequestMapping("/student")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@PostMapping("/registration")
	public StudentRegistrationDetails register(@Valid @RequestBody StudentRegistrationDetails studnetRegDetails) {
		return registrationService.register(studnetRegDetails);
	}
	
	@PutMapping("/registration")
	public String updateReg(@RequestBody StudentRegistrationDetails studentRegDetails) {
		return registrationService.updateReg(studentRegDetails);
	}
	
	@DeleteMapping("/registration/{id}")
	public String deleteReg(@PathVariable Integer id) {
		return registrationService.deleteReg(id);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllReg() {
		return registrationService.deleteAllReg();
	}
	
	@GetMapping("/registration/{id}")
	public Optional<StudentRegistrationDetails> getReg(@PathVariable Integer id) {
		return registrationService.getReg(id);
	}
	
	@GetMapping("/getAll")
	public Iterable<StudentRegistrationDetails> getAllReg() {
		return registrationService.getAllReg();
	}

}
