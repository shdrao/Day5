package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInputs() throws Exception {
		assertEquals(243, MyCalculator.power(3, 5));
		assertEquals(16, MyCalculator.power(2, 4));

	}

	@Test
	void testPowerWithZeroInputs() {
		Exception e = assertThrows(Exception.class, () -> MyCalculator.power(0, 0));
		assertEquals("The numbers cannot be zero", e.getMessage());

	}

	@Test
	void testPowerWithNegativeInputs() {
		Exception e;
		e = assertThrows(Exception.class, () -> MyCalculator.power(-2, -4));
		assertEquals("The numbers cannot be negative", e.getMessage());
		e = assertThrows(Exception.class, () -> MyCalculator.power(-2, 4));
		assertEquals("The numbers cannot be negative", e.getMessage());
		e = assertThrows(Exception.class, () -> MyCalculator.power(2, -4));
		assertEquals("The numbers cannot be negative", e.getMessage());

	}
}
