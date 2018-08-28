package com.capgemini.day5;

import com.capgemini.day5.exceptions.countryNotValidException;
import com.capgemini.day5.exceptions.employeeNameInvalidException;
import com.capgemini.day5.exceptions.taxNotEligibleException;

public class Calculator {
	

	public static double tax(String employeeName, boolean isIndian, double salary) throws taxNotEligibleException, countryNotValidException, employeeNameInvalidException {

		
		if("".equals(employeeName)) throw new employeeNameInvalidException("Enter name");
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
			throw new countryNotValidException("Foreigner");

	}
}
