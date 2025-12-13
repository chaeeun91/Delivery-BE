package com.food.delivery.user.controller;

import com.food.delivery.user.dto.UserDTO;
import com.food.delivery.user.entity.User;
import com.food.delivery.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/test")
	public List<User> test() {
		List<User> list = userService.findAll();
		return list;
	}

//	@PostMapping("/insertUser")
//	public int inserUser(@RequestBody UserDTO dto) {
//		return userService.insertUser(dto);
//	}
}
