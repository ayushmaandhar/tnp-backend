package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RegistrationRequest;
import com.example.demo.service.RegistrationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class AppUserController {
	
	private RegistrationService registrationService;

	public String register (@RequestBody RegistrationRequest request) {
		return registrationService.register (request);
	}

}
