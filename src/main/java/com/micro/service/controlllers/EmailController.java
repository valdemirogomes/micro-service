package com.micro.service.controlllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.micro.service.dtos.EmailDto;
import com.micro.service.models.Email;
import com.micro.service.services.EmailService;

import jakarta.validation.Valid;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	public ResponseEntity<Email> sendingEmail (@RequestBody @Valid EmailDto emailDto){
		Email email = new Email();
		BeanUtils.copyProperties(emailDto, email);
		emailService.sendEmail(email);
		return new ResponseEntity<>(email, HttpStatus.CREATED);
		
	}

}
