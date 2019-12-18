package com.hello.world.app.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.world.app.models.User;
import com.hello.world.app.repository.UserRepository;
import com.hello.world.app.services.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
	@Override
	public List<User> getUsers() {
	
		return (List<User>) userRepository.findAll();
	}

}
