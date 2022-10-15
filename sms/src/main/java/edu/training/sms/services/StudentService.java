package edu.training.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.training.sms.model.Student;
import edu.training.sms.repository.IStudentRepository;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public Student add(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {		
		return (List<Student>)studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student update(Student student, Integer id) {
		return studentRepository.save(student);
	}

	@Override
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
}
