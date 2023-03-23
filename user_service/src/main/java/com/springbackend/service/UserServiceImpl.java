package com.springbackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbackend.Model.User;

@Service
public class UserServiceImpl implements UserService {
	
	
	List<User> list=List.of(
			new User(1311L,"Abhishek Kumar","57653255"),
			new User(1651L,"Ravi Kumar","88770255"),
			new User(16751L,"Kaushik Kumar","997799255")
			);
	@Override
	public User getUser(Long id){
		
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null); 
		
	}

}
