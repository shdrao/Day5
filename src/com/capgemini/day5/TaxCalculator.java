package com.capgemini.day5;

import com.capgemini.day5.exceptions.CountryNotValidException;
import com.capgemini.day5.exceptions.NameNotValidException;
import com.capgemini.day5.exceptions.taxNotEligibleException;

public class TaxCalculator {

	public static Object CalculateTax(String employeeName, boolean isIndian, double salary) throws  taxNotEligibleException, CountryNotValidException, NameNotValidException {
		
		if(employeeName==null || "".equals(employeeName)) throw new NameNotValidException("Name not eligible");
		if (isIndian) {

			if (salary > 1_00_000)
				return salary * 8 / 100;
			else if (salary <= 1_00_000 && salary > 50000)
				return salary * 6 / 100;
			else if (salary <= 50000 && salary > 30000)
				return salary * 5 / 100;
			else if (salary <= 30000 && salary > 30000)
				return salary * 4 / 100;
			else
				throw new taxNotEligibleException("No taxes");

		} else
			throw new CountryNotValidException("Country not eligible");
		
		
	}

}
