package org.o7planning;

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
@RequestMapping("/api")
public class FactureRestController {
	@Autowired  
	FactureService facturesService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/fact")  
	private List<Facture> getAllFactures()   
	{  
	return facturesService.getAllFactures();  
	}  
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/fact/{numFact}")  
	private Facture getFacts(@PathVariable("numFact") int numFact)   
	{  
	return facturesService.getFactsById(numFact);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/fact/{numFact}")  
	private void deleteFact(@PathVariable("numFact") int numFact)   
	{  
		facturesService.delete(numFact);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/fact")  
	private int saveBook(@RequestBody Facture fact)   
	{  
		facturesService.saveOrUpdate(fact);  
	return fact.getNumFact();  
	} 

	
	
	//creating put mapping that updates the facture detail   
	@PutMapping("/fact/{numFact}")  
	private int saveBook(@PathVariable("numFact") int numFact,@RequestBody Facture fact)   
	{  
		  System.out.println("Update Facture with ID = " + numFact + "...");
		  Facture facture = facturesService.getFactsById(numFact);	   
		  facture.setTotalFact(fact.getTotalFact());
		  facture.setDateFact(fact.getDateFact());
		  facture.setDatePaiement(fact.getDatePaiement());
		  facture.setDateRelance(fact.getDateRelance());  
		 
		facturesService.saveOrUpdate(facture);  
	return facture.getNumFact();  
	} 
}
