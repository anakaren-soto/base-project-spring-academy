package com.hello.world.app.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hello.world.app.dto.UserDTO;
import com.hello.world.app.models.User;
@Component("UserConverter")
public class UserConverter {

	public UserDTO UsertoUserDTO(User user) {
		if(user!=null) {
		UserDTO userDTO=new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setLastname(user.getLastname());
		userDTO.setCreateDate(user.getCreateDate());
		userDTO.setStatus(user.isStatus());
		userDTO.setRoles(user.getRoles());
		return userDTO;
		}
		return null;
	}
	public User UserDTOtoUser(UserDTO userDTO) {
		User user=new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setLastname(userDTO.getLastname());
		user.setCreateDate(userDTO.getCreateDate());
		user.setStatus(userDTO.isStatus());
		user.setRoles(userDTO.getRoles());
		return user;
	}
	public List<UserDTO> UserstoUserDTO(Iterable<User> users) {
		List<UserDTO> usersDTO=new ArrayList<>();
		
		for (User user : users) {
			UserDTO userDTO=new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreateDate(user.getCreateDate());
			userDTO.setStatus(user.isStatus());
			userDTO.setRoles(user.getRoles());
			usersDTO.add(userDTO);
		}
		
		return usersDTO;
	}
	public List<User> UsersDTOtoUser(List<UserDTO> usersDTO) {
		List<User> users = new ArrayList<>();
		for (UserDTO userDTO : usersDTO) {
			User user=new User();
			user.setId(userDTO.getId());
			user.setName(userDTO.getName());
			user.setLastname(userDTO.getLastname());
			user.setCreateDate(userDTO.getCreateDate());
			user.setStatus(userDTO.isStatus());
			user.setRoles(userDTO.getRoles());
			users.add(user);
		}
		return users;
	}
}
