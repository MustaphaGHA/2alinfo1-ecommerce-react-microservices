package com.alinfo1.ordersmicroservice;

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


public class OrderRestAPI {

		private String title ="Order Microservice";
		@Autowired
		private OrderService orderService;
		@RequestMapping("/order")
		public String title() {
			System.out.println(title);
			return title;
		}
		
	    @PostMapping(path = "/orders") 
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<Order> createOrder(@RequestBody Order order)
		{
			return new ResponseEntity<>(orderService.addOrder(order),HttpStatus.OK);
		}
		
		@PutMapping(value = "/orders/orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public ResponseEntity<Order> updateOrder(@PathVariable (value = "orderId") int orderId, @RequestBody Order order)
		{
			return new ResponseEntity<>(orderService.updateOrder(orderId, order),HttpStatus.OK);
		}
		
		@DeleteMapping(value = "/orders/orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
		@ResponseStatus(HttpStatus.OK)
		public ResponseEntity<String> deleteOrder(@PathVariable (value = "orderId") int orderId)
		{
			return new ResponseEntity<>(orderService.DeleteOrder(orderId), HttpStatus.OK);
		}


}
