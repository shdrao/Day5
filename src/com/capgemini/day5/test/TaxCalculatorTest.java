package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.TaxCalculator;
import com.capgemini.day5.exceptions.CountryNotValidException;
import com.capgemini.day5.exceptions.NameNotValidException;
import com.capgemini.day5.exceptions.taxNotEligibleException;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws NameNotValidException, taxNotEligibleException, CountryNotValidException {
		assertEquals(3300.0, TaxCalculator.CalculateTax("ABC", true, 55000));
//		assertEquals(1000, TaxCalculator.CalculateTax("ABC",true,100002));
//		assertEquals(1000, TaxCalculator.CalculateTax("ABC",true,100002));
//		assertEquals(1000, TaxCalculator.CalculateTax("ABC",true,100002));

	}

	@Test
	void testCalculateTaxWithInvalidName() {
		Exception e;
		e = assertThrows(NameNotValidException.class, () -> TaxCalculator.CalculateTax("", true, 100002));
		assertEquals("Name not eligible", e.getMessage());
		e = assertThrows(NameNotValidException.class, () -> TaxCalculator.CalculateTax(null, true, 100002));
		assertEquals("Name not eligible", e.getMessage());
	}

	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		e = assertThrows(CountryNotValidException.class, () -> TaxCalculator.CalculateTax("ABC", false, 100002));
		assertEquals("Country not eligible", e.getMessage());

	}
}
