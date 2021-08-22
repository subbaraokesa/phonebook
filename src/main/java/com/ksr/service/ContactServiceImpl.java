package com.ksr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ksr.dao.ContactRepository;
import com.ksr.dto.Contact;

public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {

		try {
			contactRepository.save(contact);

		} catch (Exception e) {

			return false;
		}

		return true;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	public Contact getContactById(Integer cid) {
		return contactRepository.getById(cid);
	}

	@Override
	public boolean deleteContactById(Integer cid) {

		try {
			contactRepository.deleteById(cid);
		} catch (Exception e) {

			return false;
		}

		return true;

	}

}
