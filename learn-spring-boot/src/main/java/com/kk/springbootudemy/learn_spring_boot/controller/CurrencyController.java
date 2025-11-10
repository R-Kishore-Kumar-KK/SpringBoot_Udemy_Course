package com.kk.springbootudemy.learn_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.springbootudemy.learn_spring_boot.beans.Currency;

@RestController
public class CurrencyController {

	@Autowired
	private Currency currency;
	
	@RequestMapping("/currency")
	public Currency getCurrency() {
		return currency;
	}
}
