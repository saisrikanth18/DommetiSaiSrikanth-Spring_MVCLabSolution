package com.greatlearning.javafsd.studentmanagement2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.javafsd.studentmanagement2.entity.Student;

@Service
public interface StudentService {
	
	List<Student> listAll();
	
	void save (Student student);
	
	Student findById(int id);
	
	void deleteById(int theId);

}
