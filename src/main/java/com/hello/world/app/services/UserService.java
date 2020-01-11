package com.hello.world.app.services;

import java.util.List;

import com.hello.world.app.dto.UserDTO;
import com.hello.world.app.models.User;

public interface UserService {
	public List<UserDTO> getUsers();
	public UserDTO getUserByName(String name);

	public UserDTO findByName(String name);
	public UserDTO saveUser(User user);

}
