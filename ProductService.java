package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prdRepo;
	
	public Product createProd(Product prod) {
		return prdRepo.save(prod);
	}
	
	public List<Product> getAllProd(){
		return prdRepo.findAll();
	}
	
	public Product getProdById(int id) {
		return prdRepo.findById(id).get();
	}
	
	public void deleteProduct(int id) {
		prdRepo.deleteById(id);
	}
	
	public Product updateProduct(int id,Product prod) {
		Product newProd = prdRepo.findById(id).get();
		newProd.setBatchName(prod.getBatchName());
		newProd.setNoProduct(prod.getNoProduct());
		newProd.setPrice(prod.getPrice());
		newProd.setProdName(prod.getProdName());
		return prdRepo.save(newProd);
	}
	
}
