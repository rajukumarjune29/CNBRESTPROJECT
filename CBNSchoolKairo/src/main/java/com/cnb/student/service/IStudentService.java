package com.cnb.student.service;


import java.util.List;

import com.cnb.student.model.Student;

public interface IStudentService {

	public Student saveStudent(Student student);

	public List<Student> findStudent();
}
