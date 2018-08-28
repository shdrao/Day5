package com.capgemini.day5;

import java.util.Scanner;

import com.capgemini.day5.exceptions.nonNegativeException;
import com.capgemini.day5.exceptions.nonZeroException;

public class MyCalculatorClient {

	public static void main(String[] args) {

		int n, p;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter n and p = ");
			n = scanner.nextInt();
			p = scanner.nextInt();
			System.out.println(MyCalculator.power(n, p));
		}
		
		catch(nonNegativeException|nonZeroException e) {
			if (e instanceof nonNegativeException) 
				System.out.println(e.toString());
				else if(e instanceof nonZeroException)
					System.out.println(e.toString());
				
			
		}

		

		}
	}
