package edu.training.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.training.sms.model.Student;
import edu.training.sms.services.StudentService;

@RestController
public class StudentController {
	@Autowired	
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student add(@Validated @RequestBody Student student) {
		return studentService.add(student);
	}
	
    @GetMapping("/list")
    public List<Student> getAll()
    {
        return studentService.getAll();
    }
    
    @PutMapping("/update/{id}")
    public Student update(@RequestBody Student student, @PathVariable("id") Integer id)
    {
        return studentService.update(student, id);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
    	studentService.delete(id);
    	return "deleted successfully";
    }
}
