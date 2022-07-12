
package com.greatlearning.StudentMangementWithSecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentMangementWithSecurity.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Student findByName(String firstname);
	
	
	
}
