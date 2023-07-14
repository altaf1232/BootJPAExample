package com.springbootjpa.dao;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User,Integer>
{

}
