package com.eshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account-dashboard")
public class AccountController{


	@GetMapping(value = "/info")
	public ResponseEntity<String> function(){
		return ResponseEntity.ok("Hello");
	}

}