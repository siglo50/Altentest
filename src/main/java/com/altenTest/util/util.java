package com.altenTest.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class util {
	
	public static double round(double value) {
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public static BigDecimal roundIncrement(BigDecimal value, BigDecimal increment, RoundingMode roundingMode) {
		if (increment.signum() == 0) {
			// 0 increment does not make much sense, but prevent division by 0
			return value;
		} else {
			BigDecimal divided = value.divide(increment, 0, roundingMode);
			BigDecimal result = divided.multiply(increment);
			return result;
		}
	}
}
