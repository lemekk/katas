package com.lemekk.katas.karateChop;

public class KarateChopIterative {

	private static final int VALUE_NOT_FOUND = -1;

	public int chop(int value, int[] sortedArray) {
		if (isArrayEmpty(sortedArray)) {
			return VALUE_NOT_FOUND;
		}
		return findValue(value, sortedArray);
	}

	private int findValue(int value, int[] sortedArray) {
		int result = VALUE_NOT_FOUND;

		int from = 0;
		int to = sortedArray.length;

		while (from != to) {
			int choppedIndex = getChoppedIndex(from, to);
			int choppedValue = sortedArray[choppedIndex];

			if (choppedValue == value) {
				result = choppedIndex;
				break;
			}

			if (value > choppedValue) {
				from = choppedIndex + 1;
			} else {
				to = choppedIndex;
			}
		}

		return result;
	}

	private int getChoppedIndex(int from, int to) {
		return (to - from) / 2;
	}

	private boolean isArrayEmpty(int[] sortedArray) {
		return sortedArray == null || sortedArray.length == 0;
	}

}
