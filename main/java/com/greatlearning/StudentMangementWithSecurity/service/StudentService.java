package com.greatlearning.StudentMangementWithSecurity.service;

import java.util.List;
import com.greatlearning.StudentMangementWithSecurity.model.Student;

public interface StudentService {
	
	public List<Student> searchAll();
	
	public Student searchById(int Id);
	
	public void deleteById(int Id);

	public void save(Student studentObj);
	
	

}