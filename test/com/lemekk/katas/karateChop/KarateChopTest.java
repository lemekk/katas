package com.lemekk.katas.karateChop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public abstract class KarateChopTest {

	protected KarateChop karateChop;

	@Test
	public void testChopEmptyArray() {
		assertThat(chop(3, null), equalTo(-1));
		assertThat(chop(3, getSortedArray()), equalTo(-1));
	}

	@Test
	public void testChopValueNotFoundForSingleElementArray() {
		assertThat(chop(3, getSortedArray(1)), equalTo(-1));
	}

	@Test
	public void testChopValueFoundForSingleElementArray() {
		assertThat(chop(1, getSortedArray(1)), equalTo(0));
	}

	@Test
	public void testChopValueFoundForManyElementsArray() {
		assertThat(chop(1, getSortedArray(1, 3, 5)), equalTo(0));
		assertThat(chop(3, getSortedArray(1, 3, 5)), equalTo(1));
		assertThat(chop(5, getSortedArray(1, 3, 5)), equalTo(2));
	}

	@Test
	public void testChopValueNotFoundForManyElementsArray() {
		assertThat(chop(0, getSortedArray(1, 3, 5)), equalTo(-1));
		assertThat(chop(2, getSortedArray(1, 3, 5)), equalTo(-1));
		assertThat(chop(4, getSortedArray(1, 3, 5)), equalTo(-1));
		assertThat(chop(6, getSortedArray(1, 3, 5)), equalTo(-1));
	}

	@Test
	public void testChopValueFoundForManyEvenMoreElementsArray() {
		assertThat(chop(1, getSortedArray(1, 3, 5, 7)), equalTo(0));
		assertThat(chop(3, getSortedArray(1, 3, 5, 7)), equalTo(1));
		assertThat(chop(5, getSortedArray(1, 3, 5, 7)), equalTo(2));
		assertThat(chop(7, getSortedArray(1, 3, 5, 7)), equalTo(3));
	}

	@Test
	public void testChopValueNotFoundForManyEvenMoreElementsArray() {
		assertThat(chop(0, getSortedArray(1, 3, 5, 7)), equalTo(-1));
		assertThat(chop(2, getSortedArray(1, 3, 5, 7)), equalTo(-1));
		assertThat(chop(4, getSortedArray(1, 3, 5, 7)), equalTo(-1));
		assertThat(chop(6, getSortedArray(1, 3, 5, 7)), equalTo(-1));
		assertThat(chop(8, getSortedArray(1, 3, 5, 7)), equalTo(-1));
	}

	private int chop(int value, int[] sortedArray) {
		return this.karateChop.chop(value, sortedArray);
	}

	private int[] getSortedArray(int... elements) {
		if (elements == null) {
			return new int[0];
		}
	
		return elements;
	}

}