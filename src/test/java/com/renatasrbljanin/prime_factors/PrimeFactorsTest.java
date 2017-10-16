package com.renatasrbljanin.prime_factors;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class PrimeFactorsTest {

	@Test
	public void of_1isNone() {
		assertThat(PrimeFactors.of(1), is(ImmutableList.of()));
	}

	@Test
	public void of_2is2() {
		assertThat(PrimeFactors.of(2), is(ImmutableList.of(2)));
	}

	@Test
	public void of_3is3() {
		assertThat(PrimeFactors.of(3), is(ImmutableList.of(3)));

	}

	@Test
	public void of_4is2_2() {
		assertThat(PrimeFactors.of(4), is(ImmutableList.of(2, 2)));
	}

	@Test
	public void of_6is2_3() {
		assertThat(PrimeFactors.of(6), is(ImmutableList.of(2, 3)));
	}

	@Test
	public void of_8is2_2_2() {
		assertThat(PrimeFactors.of(8), is(ImmutableList.of(2, 2, 2)));
	}

	@Test
	public void of_9is3_3() {
		assertThat(PrimeFactors.of(9), is(ImmutableList.of(3, 3)));
	}
	
	@Test
	public void of_acceptanceTest() {
		assertThat(PrimeFactors.of(2*2*3*3*3*5*7), is(ImmutableList.of(2,2,3,3,3,5,7)));
	}
	
	

}
