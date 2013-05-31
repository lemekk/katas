package com.lemekk.katas.karateChop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class KarateChopIterativeTest {

	private KarateChopIterative karateChop;

	@Before
	public void setUp() {
		karateChop = new KarateChopIterative();
	}

	@Test
	public void testChopEmptyArray() {
		assertThat(karateChop.chop(3, null), equalTo(-1));
		assertThat(karateChop.chop(3, getSortedArray()), equalTo(-1));
	}

	@Test
	public void testChopValueNotFoundForSingleElementArray() {
		assertThat(karateChop.chop(3, getSortedArray(1)), equalTo(-1));
	}

	@Test
	public void testChopValueFoundForSingleElementArray() {
		assertThat(karateChop.chop(1, getSortedArray(1)), equalTo(0));
	}

	@Test
	public void testChopValueFoundForManyElementsArray() {
		assertThat(karateChop.chop(1, getSortedArray(1, 3, 5)), equalTo(0));
		assertThat(karateChop.chop(3, getSortedArray(1, 3, 5)), equalTo(1));
	}

	private int[] getSortedArray(int... elements) {
		if (elements == null) {
			return new int[0];
		}

		return elements;
	}
}
