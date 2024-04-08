package com.cnb.student.service;

import java.util.List;

import com.cnb.student.model.Subject;

public interface ISubjectService {
	public Subject addSubject(Subject subject);
	public List<Subject> fetchSubjects();
}
