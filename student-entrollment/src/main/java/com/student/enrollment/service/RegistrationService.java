package com.student.enrollment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.enrollment.model.StudentRegistrationDetails;
import com.student.enrollment.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public StudentRegistrationDetails register(StudentRegistrationDetails studentRegDetails) {
		return registrationRepository.save(studentRegDetails);
	}

	public String updateReg(StudentRegistrationDetails studentRegDetails) {
		registrationRepository.save(studentRegDetails);
		return "Student Registration Successfully Updated...";
	}
	
	public String deleteReg(Integer id) {
		 registrationRepository.deleteById(id);
		return "Student Registration Deleted Successfully..";
	}

	public Optional<StudentRegistrationDetails> getReg(Integer id) {
	 return registrationRepository.findById(id);
	}
	
	public Iterable<StudentRegistrationDetails> getAllReg() {
		 return registrationRepository.findAll();
		}

	public String deleteAllReg() {
		registrationRepository.deleteAll();
		return "Deleted All Student Registrations Successfully..";
	}
}
