package com.maximum.numbers;

public class MaximumNumbers {

	public static <E extends Object> E maximumNumber(E num1, E num2, E num3) {
		E max = num1;
		if (num2.toString().compareTo(max.toString()) > 0)
			max = num2;
		if (num3.toString().compareTo(max.toString()) > 0)
			max = num3;
		return max;
	}
}
