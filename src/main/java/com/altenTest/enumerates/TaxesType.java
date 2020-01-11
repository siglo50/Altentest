package com.altenTest.enumerates;


public enum TaxesType
{
	BASIC("BASIC_TAXES", 0.10),
	LOW("BOOK_FOOD_MEDICINE_TAXES", 0.00);
	
	private String type;
	private double taxeValue;
	
	private TaxesType (String type, double taxes){
		this.setType(type);
		this.setTaxeValue(taxes);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTaxeValue() {
		return taxeValue;
	}

	public void setTaxeValue(double taxeValue) {
		this.taxeValue = taxeValue;
	}



}