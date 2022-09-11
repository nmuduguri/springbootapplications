package com.student.enrollment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.enrollment.model.StudentEnrollmentDetails;
import com.student.enrollment.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

	@Autowired
	private EnrollmentRepository enrollmentRepository;
	
	public String enrollment(StudentEnrollmentDetails studentDetails) {
		
		enrollmentRepository.save(studentDetails);
		
		return "Student Entrollment Success";
	}

	public Optional<StudentEnrollmentDetails> getStudentInfo(Integer id) {
		// TODO Auto-generated method stub
	
		Optional<StudentEnrollmentDetails> student = enrollmentRepository.findById(id);
		
		return student;
	}
	
}
