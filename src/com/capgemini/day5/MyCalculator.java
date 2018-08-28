package com.capgemini.day5;

import com.capgemini.day5.exceptions.nonNegativeException;
import com.capgemini.day5.exceptions.nonZeroException;

public class MyCalculator {

	
	public static long power(int n, int p) throws nonZeroException, nonNegativeException {
		
		if (n > 0 && p > 0)
			return (long) Math.pow(n, p);
		else if (n < 0 || p < 0)
			throw new nonZeroException("The numbers cannot be negative");
		else
			throw new nonNegativeException("The numbers cannot be zero");
		}
}

	
