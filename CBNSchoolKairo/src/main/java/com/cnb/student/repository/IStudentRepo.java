package com.cnb.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnb.student.model.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
