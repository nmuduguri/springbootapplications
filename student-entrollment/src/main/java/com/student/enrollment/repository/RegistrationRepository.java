package com.student.enrollment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.enrollment.model.StudentRegistrationDetails;

@Repository
public interface RegistrationRepository extends CrudRepository<StudentRegistrationDetails, Integer> {

}
