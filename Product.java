package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String prodName;
	private String batchName;
	private double price;
	private int noProduct;
	
	public Product(int id, String prodName, String batchName, double price, int noProduct) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.batchName = batchName;
		this.price = price;
		this.noProduct = noProduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoProduct() {
		return noProduct;
	}

	public void setNoProduct(int noProduct) {
		this.noProduct = noProduct;
	}
	
}
