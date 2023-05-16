package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.dao.UserRepository;
import com.springboot.entities.User;

@SpringBootApplication
public class SpringbootApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setUserName("ANSHUL");
//		User saveUser = userRepository.save(user);
//		System.out.println(saveUser);
//		User user2 = new User();
//		user2.setUserName("ANKIT");
//		User user3 = new User();
//		user3.setUserName("AMIT");
//		List<User> users = List.of(user2,user3);
//		Iterable<User> result = userRepository.saveAll(users);
//		result.forEach(u->{
//			System.out.println(u);
//			});
//		Iterable<User> findAllUser = userRepository.findAll();
//		findAllUser.forEach(u->
//		{
//			System.out.println(u);
//		});
		
		List<User> userByName = userRepository.findByUserName("ANSHUL");
		userByName.forEach(u->{
			System.out.println(u);
		});
		
	}

}
