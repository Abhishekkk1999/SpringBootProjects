package com.springbackend.service;

import java.util.List;

import com.springbackend.model.Contact;

public interface ContactService {
	
	public List<Contact> getContactOfUser(Long userId);

}
