package com.alinfo1.productmicroservice;
import org.springframework.context.annotation.Bean;

import java.awt.print.Pageable;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	@Query("select o from product o where o.productId=productId")
	public Page<Product> productByNumber(@Param("productId") int productId, Pageable pageable);
	
}
