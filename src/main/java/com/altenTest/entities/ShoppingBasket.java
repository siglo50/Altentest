package com.altenTest.entities;

import java.util.List;

import com.altenTest.util.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ShoppingBasket {
	
	private List<Product> products;
	
	public void printProducts() {
		products.forEach((final Product product) -> log.info(product.toString()));
	}
	
	public void printTaxes() {
		log.info("Sales Taxes: " + util.round(products.stream().map(Product::getFullTaxes).mapToDouble(Double::doubleValue).sum()));
	}
	
	public void printTotal() {
		log.info("Total: " + util.round(products.stream().map(Product::getFullProductpriceAndTaxes).mapToDouble(Double::doubleValue).sum()));
	}
}
