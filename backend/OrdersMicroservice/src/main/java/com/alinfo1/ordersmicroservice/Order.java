package com.alinfo1.ordersmicroservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	private String OrderName;
	

   
	//@OneToMany(cascade=CascadeType.ALL, mappedBy="order") 
		//@OrderBy("productId") List<Product> Products;
	
  //@ManyToOne(cascade=CascadeType.PERSIST) Customer customer;
	

	public int getorderId() {
		return orderId;
	}

	public void setorderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}	
	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public Order(int orderId) {
		super();
		this.orderId = orderId;
	}

	public Order(int orderId, Date orderDate, String orderName) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		OrderName = orderName;
	}
	
	
	
	

}
