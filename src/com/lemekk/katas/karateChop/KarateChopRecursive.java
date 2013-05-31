package com.lemekk.katas.karateChop;

public class KarateChopRecursive extends KarateChop {

	@Override
	public int chop(int value, int[] sortedArray) {
		if (isArrayEmpty(sortedArray)) {
			return VALUE_NOT_FOUND;
		}

		return findValue(value, sortedArray, 0, sortedArray.length);
	}

	private int findValue(int value, int[] sortedArray, int from, int to) {
		if (from == to) {
			return VALUE_NOT_FOUND;
		}

		int choppedIndex = getChoppedIndex(from, to);
		int choppedValue = sortedArray[choppedIndex];

		if (choppedValue == value) {
			return choppedIndex;
		}

		if (value > choppedValue) {
			return findValue(value, sortedArray, choppedIndex + 1, to);
		} else {
			return findValue(value, sortedArray, from, choppedIndex);
		}
	}
}
