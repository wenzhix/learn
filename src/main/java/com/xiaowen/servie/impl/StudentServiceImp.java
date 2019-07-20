package com.xiaowen.servie.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaowen.mapper.StudentMapper;
import com.xiaowen.model.Student;
import com.xiaowen.servie.StudentService;
@Service
public class StudentServiceImp implements StudentService {
  
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
	}

	@Override
	public void deleteById(String sno) {
	    studentMapper.deleteById(sno);
	}

	@Override
	public Student findById(String sno) {
		return studentMapper.findById(sno);
	}

	@Override
	public List<Student> findAll() {
		return studentMapper.findAll();
	}

}
