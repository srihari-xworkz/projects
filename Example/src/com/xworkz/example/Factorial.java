package com.xworkz.example;

public class Factorial {

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	static int iterativeFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			int product = 1;
			for (int i = 1; i <= n; i++) {
				product *= i;
			}
			return product;
		} 
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println("factorial of given number is :" + factorial(5));
		System.out.println("factorial of number by iteration is :"+ iterativeFactorial(5));
	}

}
