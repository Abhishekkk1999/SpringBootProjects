package com.springbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springbackend.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	//fake list of contacts 
	List<Contact> list=List.of(
			new Contact(1L, "adit65@gmail.com", "Adi",1311L),
			new Contact(2L, "adil@gmail.com", "Adil",1311L),
			new Contact(3L, "rohans@gmail.com", "Rohan",1651L),
			new Contact(4L, "shyam@gmail.com", "Shyam",1675L)
			);

	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	

}
