package com.alinfo1.promomicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promo")
public class PromoRestAPI {

	@Autowired  
	PromoService promoService;  
	//creating a get mapping that retrieves all the promo detail from the database   
	@GetMapping("/promo")  
	private List<Promotion> getAllpromos()   
	{  
	return promoService.getAllPromotions();  
	}  
	//creating a get mapping that retrieves the detail of a specific promo  
	@GetMapping("/fact/{idPromo}")  
	private Promotion getPromos(@PathVariable("idPromo") int idPromo)   
	{  
	return promoService.getPromoById(idPromo);  
	}  
	//creating a delete mapping that deletes a specified promo  
	@DeleteMapping("/fact/{idPromo}")  
	private void deletePromo(@PathVariable("idPromo") int idPromo)   
	{  
		promoService.delete(idPromo);  
	}  
	//creating post mapping that post the promo detail in the database  
	@PostMapping("/promo")  
	private int savePromo(@RequestBody Promotion promo)   
	{  
		promoService.saveOrUpdate(promo);  
	return promo.getId();  
	} 

	
	
	//creating put mapping that updates the facture detail   
	@PutMapping("/fact/{idPromo}")  
	private Promotion savePromo(@PathVariable("idPromo") int idPromo,@RequestBody Promotion p)   
	{  
		  System.out.println("Update Facture with ID = " + idPromo + "...");
		  Promotion promo = promoService.getPromoById(idPromo);	   
		  promo.setCode(p.getCode());
		  promo.setPercentage(p.getPercentage());
		 
		 
		  promoService.saveOrUpdate(promo);  
	return promoService.getPromoById(idPromo);  
	} 

}