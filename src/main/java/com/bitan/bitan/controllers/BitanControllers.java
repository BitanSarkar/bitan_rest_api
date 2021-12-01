package com.bitan.bitan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitan.bitan.services.BitanServices;

@RestController
public class BitanControllers {
	
	@Autowired
	private BitanServices service;
	
	int ctr = 0;
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/get")
	public int count() {
		return ctr;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/inc")
	public int inc() {
		ctr = service.inc(ctr);
		return ctr;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "/dec")
	public int dec() {
		ctr = service.dec(ctr);
		return ctr;
	}
}
