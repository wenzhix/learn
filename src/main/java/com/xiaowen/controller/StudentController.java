package com.xiaowen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaowen.model.Student;
import com.xiaowen.servie.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/findAll")
	public List<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/findById/{sno}")
	public Student findById(@PathVariable("sno") String sno) {
		return studentService.findById(sno);
	}

	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@PutMapping("/update")
	public void update(@RequestBody Student student) {
		studentService.updateStudent(student);
	}

	@DeleteMapping("/deleteById/{sno}")
	public void deleteById(@PathVariable("sno") String sno) {
		studentService.deleteById(sno);
	}

}
