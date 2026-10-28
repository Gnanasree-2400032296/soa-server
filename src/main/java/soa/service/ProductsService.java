package soa.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import soa.model.Products;
import soa.repository.ProductsRepository;

@Service
public class ProductsService {
	
	ProductsRepository PR;
	
	public ProductsService(ProductsRepository PR)
	{
		this.PR = PR;
	}
	
	//Get All Products
	public Object getAllProducts()
	{
		Map<String, Object> response = new HashMap<>();
		try
		{
			List<Products> products = PR.findAll(); //READ
			response.put("code", 200);
			response.put("products", products);
		}catch(Exception e)
		{
			response.put("code", 500);
			response.put("message", e.getMessage());
		}
		return response;
	}
}