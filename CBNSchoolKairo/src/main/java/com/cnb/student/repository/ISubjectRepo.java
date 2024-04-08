package com.cnb.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cnb.student.model.Subject;

@Repository
public interface ISubjectRepo extends JpaRepository<Subject, Integer> {

}
