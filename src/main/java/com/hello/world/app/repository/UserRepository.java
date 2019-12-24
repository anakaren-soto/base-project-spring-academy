package com.hello.world.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hello.world.app.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
public User findByName(String name);
@Query("select user from User user where user.name=?1")
public User getUserByName(String name);
}
