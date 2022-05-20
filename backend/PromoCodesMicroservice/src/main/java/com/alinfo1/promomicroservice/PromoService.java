package com.alinfo1.promomicroservice;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoService {
		@Autowired  
		PromoRepository promotionsRepository;  
		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Promotion> getAllPromotions()   
		{  
		List<Promotion> promo = new ArrayList<Promotion>();  
		promotionsRepository.findAll().forEach(promo1 -> promo.add(promo1));  
		return promo;  
		}  
		
		public Promotion getPromoById(int idPromo)   
		{  
		return promotionsRepository.findById(idPromo).get();  
		}  
		
		public void saveOrUpdate(Promotion promo)   
		{  
			promotionsRepository.save(promo);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			promotionsRepository.deleteById(id);  
		}  
		//updating a record  
		public void update(Promotion fact, int numFact)   
		{  
			promotionsRepository.save(fact);  
		}  
	
}