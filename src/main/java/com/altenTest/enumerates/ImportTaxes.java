package com.altenTest.enumerates;


public enum ImportTaxes
{
	IMPORTED("IMPORTED_TAXES", 0.05),
	LOCAL("LOCAL_TAXES", 0.0); 
	
	private String type;
	private double taxeValue;
	
	private ImportTaxes (String type, double taxes){
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