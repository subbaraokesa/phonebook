package com.ksr.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name  = "contact_details")  
public class Contact {

	@Id
	@GeneratedValue
	private int contactId;
	
	@Column(name = "contact_name")
	private String contactName;
	@Column(name = "contact_number")
	private Long contactNumber;
	@Column(name = "contact_email")
	private String contactEmail;
	@Column(name = "active_sw")
	private char activeSw;
	
	@Column(name = "created_date")
	private LocalDate createdDate;
	@Column(name = "updated_date")
	private LocalDate upadatedDate;
	
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public char getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(char activeSw) {
		this.activeSw = activeSw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpadatedDate() {
		return upadatedDate;
	}
	public void setUpadatedDate(LocalDate upadatedDate) {
		this.upadatedDate = upadatedDate;
	}
	
	
	
	
	
	
	
	
	
	
	

}
