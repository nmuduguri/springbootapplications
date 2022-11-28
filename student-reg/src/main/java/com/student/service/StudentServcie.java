package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServcie {

	@Autowired
	private StudentRepository studentRepo;

	public Student save(Student stu) {
		return studentRepo.save(stu);
	}

	public Optional<Student> get(int id) {

		return studentRepo.findById(id);
	}

	public List<Student> getAll() {
		return studentRepo.findAll();
	}

	public void delete(int id) {
		studentRepo.deleteById(id);
	}

	public Student udpate(Student stu) {

		Student dbStudent = studentRepo.fetchStudent(stu.getSid());
		
		System.out.println("database record :"+dbStudent);
		System.out.println("request record :"+stu);

		if (dbStudent != null) {

			if (stu.getFristName() != null && !stu.getFristName().isEmpty()) {

				dbStudent.setFristName(stu.getFristName());
			}

			if (stu.getLastName() != null && !stu.getLastName().isEmpty()) {

				dbStudent.setLastName(stu.getLastName());
			}

			if (stu.getEmail() != null && !stu.getEmail().isEmpty()) {

				dbStudent.setEmail(stu.getEmail());
			}

			if (stu.getMobile() != null && !stu.getMobile().isEmpty()) {

				dbStudent.setMobile(stu.getMobile());
			}

			if (stu.getBranch() != null && !stu.getBranch().isEmpty()) {

				dbStudent.setBranch(stu.getBranch());
			}

			return studentRepo.save(dbStudent);

		} else {

			return studentRepo.save(stu);
		}
	}

}
