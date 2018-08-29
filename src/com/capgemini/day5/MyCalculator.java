package com.capgemini.day5;

public class MyCalculator {

	public static long power(int n, int p) throws Exception {
		long result = 1;
		if (n < 0 || p < 0)
			{throw new Exception("The numbers cannot be negative");}
		else if (n == 0 && p == 0)
			{throw new Exception("The numbers cannot be zero");}
		else
			{for (int i = 1; i <= p; i++)
				result *= n;
		return result;
			}
	}
}
