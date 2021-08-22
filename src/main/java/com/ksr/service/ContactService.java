package com.ksr.service;

import java.util.List;

import com.ksr.dto.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id) ;
	
	public boolean deleteContactById(Integer cid);
	
	
}
