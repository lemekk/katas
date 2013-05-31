package com.lemekk.katas.karateChop;

public abstract class KarateChop {

	protected static final int VALUE_NOT_FOUND = -1;

	public abstract int chop(int value, int[] sortedArray);

	protected int getChoppedIndex(int from, int to) {
		return ((to - from) / 2) + from;
	}

	protected boolean isArrayEmpty(int[] sortedArray) {
		return sortedArray == null || sortedArray.length == 0;
	}

}