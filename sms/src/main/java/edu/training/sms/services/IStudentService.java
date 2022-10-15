package edu.training.sms.services;

import java.util.List;

import edu.training.sms.model.Student;

public interface IStudentService {

	Student add(Student student);
	List<Student> getAll();
	Student getStudentById(Integer id);
	Student update(Student student, Integer id);
	void delete(Integer id);
}
