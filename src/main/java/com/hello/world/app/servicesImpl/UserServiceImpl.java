package com.hello.world.app.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hello.world.app.converter.UserConverter;
import com.hello.world.app.dto.UserDTO;
import com.hello.world.app.models.User;
import com.hello.world.app.repository.UserRepository;
import com.hello.world.app.services.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
@Autowired
@Qualifier("UserConverter")
private UserConverter userConverter;
	@Override
	public List<UserDTO> getUsers() {
	return userConverter.UserstoUserDTO(userRepository.findAll());
	//	return (List<User>) userRepository.findAll();
	}
	@Override
	public UserDTO getUserByName(String name) {
		return userConverter.UsertoUserDTO(userRepository.getUserByName(name));
	}
	@Override
	public UserDTO findByName(String name) {
		return userConverter.UsertoUserDTO(userRepository.findByName(name));
	}
	@Override
	public UserDTO saveUser(User user) {
		return userConverter.UsertoUserDTO(userRepository.save(user));
	}

}
