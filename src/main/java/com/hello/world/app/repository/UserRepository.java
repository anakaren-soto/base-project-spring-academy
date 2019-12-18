package com.hello.world.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hello.world.app.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
