package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Student;
import com.capgemini.day5.exceptions.AgeNotWithinRangeException;
import com.capgemini.day5.exceptions.NameNotValidException;

class StudentTest {

	@Test
	void testWithInvalidAge() {
		
			Exception e;
			e = assertThrows(AgeNotWithinRangeException.class, () -> new Student(1234,"ABC",0,"Arts"));
			e = assertThrows(AgeNotWithinRangeException.class, () -> new Student(1234,"ABC",10,"Arts"));
	}
	@Test
	void testWithInvalidName() {
		
			Exception e;
			e = assertThrows(NameNotValidException.class, () -> new Student(1234,"A+B;C",19,"Arts"));
			
	}
	@Test
	void testWithValidDetails() throws AgeNotWithinRangeException, NameNotValidException {
		assertNotNull(new Student(1234,"abc",19,"Arts"));
	}
	

}
