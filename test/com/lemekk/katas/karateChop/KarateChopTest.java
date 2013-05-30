package com.lemekk.katas.karateChop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KarateChopTest {

	private KarateChop karateChop;

	@Before
	public void setUp() {
		karateChop = new KarateChop();
	}

	@Test
	public void testChopEmptyArray() {
		assertEquals(-1, karateChop.chop(3, getSortedArray()));
	}

	private int[] getSortedArray(int... elements) {
		if (elements == null) {
			return new int[0];
		}

		return elements;
	}
}
