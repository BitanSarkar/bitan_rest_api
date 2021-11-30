package com.bitan.bitan.services;

import org.springframework.stereotype.Service;

@Service
public class BitanServices {
	
	public int inc(int a) {
		return a+1;
	}
	
	public int dec(int a) {
		return a-1;
	}
}
