package com.springbootjpa;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.springbootjpa.dao.UserRepository;







@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootJpaExampleApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
	
	//here i create a new User
	  User user=new User();
	  user.setName("altfa");
	  user.se
	  
	  

		
		
	}

}
