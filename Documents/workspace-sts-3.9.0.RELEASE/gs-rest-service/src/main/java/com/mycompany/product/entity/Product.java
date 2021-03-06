package com.mycompany.product.entity;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id = 1;
	
	@Column(nullable=false)
	private String name = "Oranges ";
	
	@Column(nullable=false)
	private int catId = 2;

	public Product() {
		
	}
	
	public Product(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getId() {
		return id;
	}

}