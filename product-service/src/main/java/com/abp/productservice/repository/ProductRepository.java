package com.abp.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abp.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

	
	
}
