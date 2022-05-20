package org.o7planning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureService {
	@Autowired  
	FactureRepository facturesRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Facture> getAllFactures()   
	{  
	List<Facture> fact = new ArrayList<Facture>();  
	facturesRepository.findAll().forEach(fact1 -> fact.add(fact1));  
	return fact;  
	}  
	
	public Facture getFactsById(int numFact)   
	{  
	return facturesRepository.findById(numFact).get();  
	}  
	
	public void saveOrUpdate(Facture fact)   
	{  
		facturesRepository.save(fact);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		facturesRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Facture fact, int numFact)   
	{  
		facturesRepository.save(fact);  
	}  
}
