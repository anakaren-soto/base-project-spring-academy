package com.hello.world.app.services;

import java.util.List;

import com.hello.world.app.dto.UserDTO;

public interface UserService {
	public List<UserDTO> getUsers();
	public UserDTO getUserByName(String name);

	public UserDTO findByName(String name);


}
