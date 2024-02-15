package com.micro.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.service.repositories.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

}
