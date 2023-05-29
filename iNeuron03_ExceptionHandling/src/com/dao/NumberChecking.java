package com.dao;

import java.util.Scanner;

class Access {
	Scanner scan = new Scanner(System.in);
	Integer value;

	void provide() {
		System.out.println("WELCOME \n Enter Number For checking :: ");
		value = scan.nextInt();
		num(value);

	}

	void num(int a) {
		try {
			if (a < 0)
				throw new ArithmeticException("Number is Negative ");
			else
				System.out.println("Given Number is positive " + a);

		} catch (ArithmeticException e) {
			System.out.println("Number is Negative");
			e.printStackTrace();
		}

	}
}

public class NumberChecking {

	public static void main(String[] args) {
		Access ac = new Access();
		ac.provide();
	}

}
