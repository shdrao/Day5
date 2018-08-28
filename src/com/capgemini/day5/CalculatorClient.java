package com.capgemini.day5;

import java.util.Scanner;

import com.capgemini.day5.exceptions.countryNotValidException;
import com.capgemini.day5.exceptions.employeeNameInvalidException;
import com.capgemini.day5.exceptions.taxNotEligibleException;

public class CalculatorClient {

	public static void main(String[] args) {

		String employeeName;
		boolean isIndian;
		double salary;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter the details = ");
			employeeName = scanner.nextLine();
			isIndian = scanner.nextBoolean();
			salary = scanner.nextDouble();
			Calculator c = new Calculator();
			System.out.println(c.tax(employeeName, isIndian, salary));
		}

		catch (taxNotEligibleException | employeeNameInvalidException | countryNotValidException e) {
			if (e instanceof taxNotEligibleException)
				System.out.println(e.toString());
			else if (e instanceof employeeNameInvalidException)
				System.out.println(e.toString());
			else if (e instanceof countryNotValidException)
				System.out.println(e.toString());
		}
	}
}