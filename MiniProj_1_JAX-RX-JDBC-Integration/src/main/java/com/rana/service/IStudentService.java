package com.rana.service;

import java.util.List;

import com.rana.student.Student;

public interface IStudentService {
	Integer saveStudent(Student student);
	 List<Student>	getAllStudents();
	 boolean removeOneStudent(Integer id);
	 Student getOneStudent(Integer sid);
	 boolean updateStudent(Student s);
}
