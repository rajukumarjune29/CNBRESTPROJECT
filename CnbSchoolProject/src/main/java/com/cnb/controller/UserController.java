package com.cnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnb.model.UserVo;
import com.cnb.service.IUserService;

@RestController
@RequestMapping("/user-section")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<?> createNewUser(@RequestBody UserVo userVo){
		userVo=userService.createUser(userVo);
		return ResponseEntity.ok(userVo);
	}

}
