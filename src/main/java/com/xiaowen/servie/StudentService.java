package com.xiaowen.servie;

import java.util.List;

import com.xiaowen.model.Student;

public interface StudentService {
    
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteById(String sno);
	Student findById(String sno);
	List<Student> findAll();
}
