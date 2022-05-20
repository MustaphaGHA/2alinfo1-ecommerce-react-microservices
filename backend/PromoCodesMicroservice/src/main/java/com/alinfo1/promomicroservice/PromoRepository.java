package com.alinfo1.promomicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories ("com.alinfo1.promomicroservice")
public interface PromoRepository extends JpaRepository<Promotion , Integer> {


		
		
}
