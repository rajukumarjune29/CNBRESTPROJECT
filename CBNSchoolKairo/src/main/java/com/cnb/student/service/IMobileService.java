package com.cnb.student.service;


import com.cnb.student.model.Mobile;
import com.cnb.student.model.Student;

public interface IMobileService {
	public Mobile addMobiles(Mobile mobiles);
	public Student fetchStudentByMobile(Mobile mobile);
}
