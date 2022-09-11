package com.student.enrollment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.enrollment.model.StudentEnrollmentDetails;

@Repository
public interface EnrollmentRepository extends CrudRepository<StudentEnrollmentDetails, Integer> {

}
