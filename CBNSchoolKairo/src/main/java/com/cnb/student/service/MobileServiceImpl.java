package com.cnb.student.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnb.student.model.Mobile;
import com.cnb.student.model.Student;
import com.cnb.student.repository.IMobileRepo;

@Service
public class MobileServiceImpl implements IMobileService {

	@Autowired
	private IMobileRepo mobileRepo;
	@Override
	public Mobile addMobiles(Mobile mobile) {
	
		
		return mobileRepo.save(mobile);
	}

	@Override
	public Student fetchStudentByMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return null;
	}

}
