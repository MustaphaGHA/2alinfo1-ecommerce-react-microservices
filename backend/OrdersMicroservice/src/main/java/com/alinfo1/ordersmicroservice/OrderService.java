package com.alinfo1.ordersmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;
	
	public Order addOrder(Order order)
	{
		return  OrderRepository.save(order);
	}
	
	public Order updateOrder(int orderId , Order NewOrder) {
		
		if(OrderRepository.findById(orderId).isPresent())
		{
			Order existingOrder = OrderRepository.findById(orderId).get();
			existingOrder.setOrderDate(NewOrder.getOrderDate());
			existingOrder.setOrderName(NewOrder.getOrderName());
			return OrderRepository.save(existingOrder);
		}
		else		
		return null;	
	}
	
	public String DeleteOrder (int orderId) {
    if(OrderRepository.findById(orderId).isPresent()) 
    {
    	OrderRepository.deleteById(orderId);
    	 
    	return "Order  deleted";
    }
    else 
    	return "Order not deleted";
	}
	
}
