package com.micro.service.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.micro.service.services.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;

}
