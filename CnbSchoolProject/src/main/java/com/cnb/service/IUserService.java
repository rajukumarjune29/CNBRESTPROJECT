package com.cnb.service;

import java.util.List;

import com.cnb.entity.User;
import com.cnb.model.UserVo;

public interface IUserService {

	public UserVo createUser(UserVo userVo);

	public List<User> getUsers();
}
