package com.lemekk.katas.karateChop;

public class KarateChopIterative extends KarateChop {

	@Override
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

}
