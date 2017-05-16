package com.offloadmemory.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Page<User> getUsers(Pageable pageable){
		return userRepository.findAll(pageable);
	}
}
