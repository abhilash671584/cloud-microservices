package com.abp.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
@RefreshScope
public class TestController {
	
	
	@Value("${test}")
	private String test;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String test() {
		return test;
	}
	
}
