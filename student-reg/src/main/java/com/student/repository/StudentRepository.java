package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	@Query("SELECT s FROM Student s WHERE s.sid =:sid")
	public Student fetchStudent(int sid);

}
