package com.nttdata.bootcamp.configservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${product.product-name}")
	private String myProduct;
	
	@GetMapping(path="/getProductName")
	public String myProduct() {
		return this.myProduct;
		
	}

}
