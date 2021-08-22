package com.ksr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ksr.dto.Contact;
import com.ksr.service.ContactServiceImpl;

@Controller
public class ContactController {

	private ContactServiceImpl contactService;
	
	@GetMapping
	public String getAll(Model model)
	{
		List<Contact> contactList = new ArrayList<Contact>();
		
	            contactList  = 	contactService.getAllContacts();
	            model.addAllAttributes(contactList)      ;   
	            
	            return  "welcome";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
