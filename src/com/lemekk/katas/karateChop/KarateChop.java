package com.lemekk.katas.karateChop;

public class KarateChop {

	private static final int VALUE_NOT_FOUND = -1;

	public int chop(int value, int[] sortedArray) {
		if (isArrayEmpty(sortedArray)) {
			return VALUE_NOT_FOUND;
		}
		return VALUE_NOT_FOUND;
	}

	private boolean isArrayEmpty(int[] sortedArray) {
		return sortedArray == null || sortedArray.length == 0;
	}

}
