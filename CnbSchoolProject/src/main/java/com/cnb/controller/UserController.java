package com.cnb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnb.entity.User;
import com.cnb.model.UserVo;
import com.cnb.service.IUserService;

@RestController
@RequestMapping("/user-section")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/user")
	public ResponseEntity<?> createNewUser(@RequestBody UserVo userVo) {
		userVo = userService.createUser(userVo);
		return ResponseEntity.ok(userVo);
	}

	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		List<User> userVo = userService.getUsers();
		return ResponseEntity.ok(userVo);
	}
	@PatchMapping("/update-user")
	public ResponseEntity<?> updateUser(@RequestBody UserVo userVo){
		userVo=userService.updateUser(userVo);
		return ResponseEntity.ok(userVo);
	}

}
