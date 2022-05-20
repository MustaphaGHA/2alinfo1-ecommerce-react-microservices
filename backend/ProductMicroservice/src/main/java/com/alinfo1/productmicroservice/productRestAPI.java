package com.alinfo1.productmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


public class productRestAPI {

		private String title ="product Microservice";
		@Autowired
		private ProductService productService;
		@RequestMapping("/product")
		public String title() {
			System.out.println(title);
			return title;
		}
		
	    @PostMapping(path = "/products") 
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<Product> createproduct(@RequestBody Product product)
		{
			return new ResponseEntity<>(productService.addproduct(product),HttpStatus.OK);
		}
		
		@PutMapping(value = "/products/productId}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public ResponseEntity<Product> updateproduct(@PathVariable (value = "productId") int productId, @RequestBody Product product)
		{
			return new ResponseEntity<>(productService.update(productId, product),HttpStatus.OK);
		}
		
		@DeleteMapping(value = "/products/productId}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public ResponseEntity<String> deleteproduct(@PathVariable (value = "productId") int productId)
		{
			return new ResponseEntity<>(productService.Delete(productId), HttpStatus.OK);
		}


}
