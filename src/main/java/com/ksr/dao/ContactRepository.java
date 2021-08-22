package com.ksr.dao;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.ksr.dto.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> 
{
}