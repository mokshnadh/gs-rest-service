package com.mycompany.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.product.dao.ProductRepository;
import com.mycompany.product.entity.Product;


@RestController
public class ProductService {

	@Autowired
	ProductRepository productRepository ;
	
	@RequestMapping(value="/{env}/product/{id}")
	List<Product> getProduct(@PathVariable("id") int id) {
		return productRepository.findOne(id) ;
	}
	
	@RequestMapping("/products")
	List<Product> getProductsForCategory(@RequestParam("id") int id) {
		return productRepository.findByCatId(id);
	}
	
}