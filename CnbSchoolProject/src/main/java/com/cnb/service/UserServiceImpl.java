package com.cnb.service;

import java.util.List;
import java.util.Optional;

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
		User user = new User();
		user.setDob(userVo.getDob());
		user.setEmailId(userVo.getEmailId());
		user.setName(userVo.getName());
		user.setGender(userVo.getGender());
		user.setMobileNo(userVo.getMobileNo());
		user.setIsActive(true);
		user = userRepo.save(user);
		userVo.setUserId(user.getUserId());
		return userVo;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public UserVo updateUser(UserVo userVo) {
		Optional<User> userOp = userRepo.findById(userVo.getUserId());
		if (userOp.isEmpty()) {
			throw new RuntimeException("User not Found");
		}
		User user = userOp.get();
		user.setDob(userVo.getDob());
		user.setEmailId(userVo.getEmailId());
		user.setIsActive(userVo.getIsActive());
		user.setMobileNo(userVo.getMobileNo());
		user.setName(userVo.getName());
		userRepo.save(user);
		return userVo;
	}

}
