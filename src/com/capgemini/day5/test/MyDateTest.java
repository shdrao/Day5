package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;
import com.capgemini.day5.MyDate;
import com.capgemini.day5.Student;
import com.capgemini.day5.exceptions.InvalidDayException;
import com.capgemini.day5.exceptions.InvalidMonthException;

class MyDateTest {

	@Test

	void testMyDateWithInvalidDate() {
		Exception e;
		e= assertThrows(InvalidDayException.class, () -> new MyDate(41,10,2010));
		assertEquals("Date is invalid", e.getMessage());
		e= assertThrows(InvalidDayException.class, () -> new MyDate(31,04,2010));
		assertEquals("Date is invalid", e.getMessage());
	}
	
	@Test

	void testMyDateWithInvalidMonth() {
		Exception e = assertThrows(InvalidMonthException.class, () -> new MyDate(21,14,2010));
		assertEquals("Month is invalid", e.getMessage());
	}

	@Test

	void testMyDateWithValidDetails() throws InvalidDayException, InvalidMonthException {
		assertNotNull(new MyDate(21,03,1996));
	}
}
