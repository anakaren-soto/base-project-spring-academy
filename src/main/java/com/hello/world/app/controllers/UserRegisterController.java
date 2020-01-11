package com.hello.world.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.hello.world.app.dto.UserDTO;
import com.hello.world.app.models.User;
import com.hello.world.app.services.UserService;

@RestController
@RequestMapping("/registra")
public class UserRegisterController {
	@Autowired
	UserService userService;

	@PostMapping(value = "/usuario", headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json; charset=UTF-8")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		Map<String, Object> response = new HashMap<>();
		UserDTO userDto = userService.saveUser(user);
		
		if (userDto == null) {
			response.put("data", "Usuario no pudo ser registrado correctamente");
		} else {
			response.put("data", userDto);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
	}

}
