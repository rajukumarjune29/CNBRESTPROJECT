package com.cnb.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnb.student.model.Subject;
import com.cnb.student.repository.ISubjectRepo;

@Service
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectRepo subjectRepo;
	
	@Override
	public Subject addSubject(Subject subject) {
		
		return subjectRepo.save(subject);
	}

	@Override
	public List<Subject> fetchSubjects() {
		
		return subjectRepo.findAll();
	}

}
