package com.greatlearning.StudentMangementWithSecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.StudentMangementWithSecurity.model.Student;
import com.greatlearning.StudentMangementWithSecurity.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> searchAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student searchById(int Id) {
		Optional<Student> student;
		student = studentRepository.findById(Id);
		return student.orElseThrow();
	}

	
	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}
	
	@Override
	public void deleteById(int Id) {
		studentRepository.deleteById(Id);
		
		
	}

	

}
