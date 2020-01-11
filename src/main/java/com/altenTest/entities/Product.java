package com.altenTest.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.altenTest.enumerates.ImportTaxes;
import com.altenTest.enumerates.TaxesType;
import com.altenTest.util.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Product {
	
	private String name;
	private TaxesType taxesType;
	private Double price;
	private int quantity;
	private boolean imported;
	
	public double getFullProductpriceAndTaxes() {
		return util.round(this.quantity * (this.price + getFullTaxes()));
		
	}
	
	public double getFullTaxes() {
		return getNormalTaxes() + getImportTaxes();
	}
	
	private double getNormalTaxes(){
		return util.roundIncrement(BigDecimal.valueOf(price * taxesType.getTaxeValue()), new BigDecimal(0.05), RoundingMode.UP).doubleValue();
	}
	
	private double getImportTaxes(){
		double importTaxes = price * (this.imported? ImportTaxes.IMPORTED.getTaxeValue() : ImportTaxes.LOCAL.getTaxeValue()); 
		BigDecimal bdRounded = util.roundIncrement(BigDecimal.valueOf(importTaxes), new BigDecimal(0.05), RoundingMode.UP);
		return bdRounded.doubleValue();		
	}
	
	@Override
	public String toString() {
		/*if want to see descomposition of total price*/
		// + " (" + price +" + " + getNormalTaxes() + " + " + getImportTaxes() + ")";*/
		return Integer.toString(this.quantity) + " " + this.name + " " + getFullProductpriceAndTaxes();
	}
}
