package com.cnb.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnb.student.model.Student;
import com.cnb.student.repository.IStudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> findStudent() {
		
		return studentRepo.findAll();
	}

}
