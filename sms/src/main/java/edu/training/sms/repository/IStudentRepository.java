package edu.training.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.training.sms.model.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer> {
	
}
