package com.micro.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.service.dtos.EmailDto;
import com.micro.service.models.Email;
import com.micro.service.repositories.EmailRepository;

import jakarta.validation.Valid;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(Email email) {
		emailRepository.save(email);
		
		
	}

}
