package com.lemekk.katas.karateChop;

import static java.util.Arrays.copyOfRange;

public class KarateChopOffset extends KarateChop {

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

		if (choppedValue == value) {
			return choppedIndex + offset;
		}

		if (value > choppedValue) {
			return findValue(
					value,
					copyOfRange(sortedArray, choppedIndex + 1,
							sortedArray.length), offset + choppedIndex + 1);
		} else {
			return findValue(value, copyOfRange(sortedArray, 0, choppedIndex),
					offset);
		}
	}

}
