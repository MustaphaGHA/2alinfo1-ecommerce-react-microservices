package com.alinfo1.productmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private static final String ProductRepository = null;
	@Autowired
	private ProductRepository repository;
	
	public Product addproduct(Product product)
	{
		return  repository.save(product);
	}
	
	public Product update(int productId , Product New) {
		
		if(repository.findById(productId).isPresent())
		{
			Product existing = repository.findById(productId).get();
			existing.setProductDate(New.getProductDate());
			existing.setProductName(New.getProductName());
			return repository.save(existing);
		}
		else		
		return null;	
	}
	
	public String Delete (int Id) {
    if(repository.findById(Id).isPresent()) 
    {
    	repository.deleteById(Id);
    	 
    	return "  deleted";
    }
    else 
    	return " not deleted";
	}
	
}
