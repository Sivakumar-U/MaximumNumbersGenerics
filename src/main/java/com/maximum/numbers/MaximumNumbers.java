package com.maximum.numbers;

public class MaximumNumbers<E extends Comparable<?>> {
	E num1;
	E num2;
	E num3;

	public MaximumNumbers(E num1, E num2, E num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public <E extends Comparable<?>> E testMaximum() {
		E max = (E) num1;
		if (num2.toString().compareTo(max.toString()) > 0)
			max = (E) num2;
		if (num3.toString().compareTo(max.toString()) > 0)
			max = (E) num3;
		return max;
	}
}
