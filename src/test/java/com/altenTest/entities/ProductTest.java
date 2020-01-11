package com.altenTest.entities;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.altenTest.enumerates.TaxesType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ProductTest {

	@Test
	void testImput1() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("book", TaxesType.LOW, 12.49, 1, false));
		products.add(new Product("music CD", TaxesType.BASIC, 14.99, 1, false));
		products.add(new Product("chocolate", TaxesType.LOW, 0.85, 1, false));
		shoppingBasket.setProducts(products);
		log.info("///////////testImput1//////////////////////");
		shoppingBasket.printProducts();
		shoppingBasket.printTaxes();
		shoppingBasket.printTotal();
	}
	
	@Test
	void testImput2() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("imported box of chocolates", TaxesType.LOW, 10.00, 1, true));
		products.add(new Product("imported bottle of perfume", TaxesType.BASIC, 47.50, 1, true));
		shoppingBasket.setProducts(products);
		log.info("///////////testImput2//////////////////////");
		shoppingBasket.printProducts();
		shoppingBasket.printTaxes();
		shoppingBasket.printTotal();
	}
	
	@Test
	void testImput3() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("imported bottle of perfume", TaxesType.BASIC, 27.99, 1, true));
		products.add(new Product("bottle of perfume", TaxesType.BASIC, 18.99, 1, false));
		products.add(new Product("packet of headache pills", TaxesType.LOW, 9.75, 1, false));
		products.add(new Product("box of imported chocolates", TaxesType.LOW, 11.25, 1, true));
		shoppingBasket.setProducts(products);
		log.info("///////////testImput3//////////////////////");
		shoppingBasket.printProducts();
		shoppingBasket.printTaxes();
		shoppingBasket.printTotal();
	}

}
