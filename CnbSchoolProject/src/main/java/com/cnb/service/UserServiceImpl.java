package com.cnb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnb.entity.User;
import com.cnb.model.UserVo;
import com.cnb.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepo;
	@Override
	public UserVo createUser(UserVo userVo) {
		User user =new User();
		user.setDob(userVo.getDob());
		user.setEmailId(userVo.getEmailId());
		user.setName(userVo.getName());
		user.setGender(userVo.getGender());
		user.setMobileNo(userVo.getMobileNo());
		user.setIsActive(true);
		user=userRepo.save(user);
		userVo.setUserId(user.getUserId());
		return userVo;
	}

}
