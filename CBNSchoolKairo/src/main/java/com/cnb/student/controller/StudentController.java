package com.cnb.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnb.student.model.Mobile;
import com.cnb.student.model.Student;
import com.cnb.student.model.Subject;
import com.cnb.student.service.IMobileService;
import com.cnb.student.service.IStudentService;
import com.cnb.student.service.ISubjectService;

@RestController
@RequestMapping("/students-module")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private IMobileService mobileService;
	@Autowired
	private ISubjectService subjectService;
	@PostMapping("/register/")
	public ResponseEntity<?> register(@RequestBody Student student) {
		studentService.saveStudent(student);
		return new ResponseEntity<String>("", HttpStatus.CREATED);
	}
	
	@GetMapping("/students")
	public ResponseEntity<?> fetchStudent() {
		List<Student> students = studentService.findStudent();
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@PostMapping("/add-mobile")
	public ResponseEntity<?> addMobile(@RequestBody Mobile mobile){
		Mobile status= mobileService.addMobiles(mobile);
		return new ResponseEntity<String>(status.getMobileId().toString(), HttpStatus.CREATED);
	}
	@PostMapping("/add-subject")
	public ResponseEntity<?> register(@RequestBody Subject subject) {
	Subject status=	subjectService.addSubject(subject);
		return new ResponseEntity<String>(status.getSubjectId().toString(), HttpStatus.CREATED);
	}
}
