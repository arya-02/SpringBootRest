package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService prdSer;
	
	@PostMapping("/addProduct")
	public Product createProduct(@RequestBody Product prod) {
		return prdSer.createProd(prod);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return prdSer.getAllProd();
	}
	
	@PutMapping("/editProduct/{id}")
	public Product editProduct(@RequestBody Product prod,@PathVariable int id) {
		return prdSer.updateProduct(id, prod);
	}
	
	@GetMapping("/product/{id}")
	public Product getOneProduct(@PathVariable int id) {
		return prdSer.getProdById(id);
	}
	
}
