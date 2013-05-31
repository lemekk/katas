package com.lemekk.katas.karateChop;

import java.util.Arrays;

public class KarateChopRecursiveWithOffset extends KarateChop {

	@Override
	public int chop(int value, int[] sortedArray) {
		if (isArrayEmpty(sortedArray)) {
			return VALUE_NOT_FOUND;
		}

		return findValue(value, sortedArray, 0);
	}

	private int findValue(int value, int[] sortedArray, int offset) {
		if (sortedArray.length == 0) {
			return VALUE_NOT_FOUND;
		}

		int choppedIndex = getChoppedIndex(0, sortedArray.length);
		int choppedValue = sortedArray[choppedIndex];

		if (value == choppedValue) {
			return choppedIndex + offset;
		}

		if (value > choppedValue) {
			return findValue(value, Arrays.copyOfRange(sortedArray,
					choppedIndex + 1, sortedArray.length), offset
					+ choppedIndex + 1);
		} else {
			return findValue(value,
					Arrays.copyOfRange(sortedArray, 0, choppedIndex), offset);
		}
	}
}
