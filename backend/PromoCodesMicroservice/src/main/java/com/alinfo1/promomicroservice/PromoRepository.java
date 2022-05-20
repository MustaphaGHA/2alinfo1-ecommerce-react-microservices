package com.alinfo1.promomicroservice;

import org.springframework.data.jpa.repository.JpaRepository;

public class PromoRepository {
	public interface CandidatRepository extends JpaRepository<Promotion , Integer> {}

	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Promotion promotion) {
		// TODO Auto-generated method stub
		
	}
}
