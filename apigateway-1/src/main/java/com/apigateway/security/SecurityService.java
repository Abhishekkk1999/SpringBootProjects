package com.apigateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.apigateway.model.Model;
import com.apigateway.repository.SecurityRepository;

@Service
public class SecurityService implements UserDetailsService{
	
	@Autowired
	SecurityRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Model details=repo.findById(username).get();
		
		return new SecurityDetails(details);
	}

}
