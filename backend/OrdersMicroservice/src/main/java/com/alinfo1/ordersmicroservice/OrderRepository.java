package com.alinfo1.ordersmicroservice;
import org.springframework.context.annotation.Bean;

import java.awt.print.Pageable;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order,Integer> {
	
	@Query("select o from Order o where o.orderId=orderId")
	public Page<Order> orderByNumber(@Param("orderId") int orderId, Pageable pageable);
	
}
