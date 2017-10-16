package com.renatasrbljanin.prime_factors;

import java.util.List;

import com.google.common.collect.Lists;

public class PrimeFactors {

	public static List<Integer> of(int n) {

		List<Integer> factors = Lists.newArrayList();

		int divisor = 2;

		while (n > 1) {

			while (n % divisor == 0) {
				factors.add(divisor);
				n /= divisor;
			}
			divisor++;
		}

		return factors;
	}

}
