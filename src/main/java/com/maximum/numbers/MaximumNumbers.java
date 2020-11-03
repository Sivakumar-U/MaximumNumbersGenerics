package com.maximum.numbers;

import java.util.Arrays;

public class MaximumNumbers<T extends Comparable> {
	T[] valueArray;

	public MaximumNumbers(T... value) {
		T[] array = (T[]) new Comparable[value.length];
		int i = 0;
		for (T val : value) {
			array[i] = val;
			i++;
		}
		this.valueArray = array;
	}

	public T testMaximum() {
		Arrays.sort(valueArray);
		printMax(valueArray.length - 1);
		return valueArray[valueArray.length - 1];

	}

	private static <T> void printMax(T maximumNumbers) {
		System.out.println("Maximum Value:" + maximumNumbers);

	}
}
