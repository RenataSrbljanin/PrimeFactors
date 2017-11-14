package com.renatasrbljanin.prime_factors;

import java.util.Scanner;

public class PrimeFactorsUtil {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter an integer to get it's prime factors ");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		System.out.println(PrimeFactors.of(n));
		
		in.close();
	}
}
