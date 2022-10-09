package com.abp.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abp.productservice.model.Product;
import com.abp.productservice.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/api/product")
@AllArgsConstructor
public class ProductController {

	private final ProductRepository productRepository;
	

	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll(){
		return productRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product){
		productRepository.save(product);
	}
	
	@GetMapping("/id/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Product> findById(@PathVariable("id") String id){
		return productRepository.findById(id);
	}
	

	
}
