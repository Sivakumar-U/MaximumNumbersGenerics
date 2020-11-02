package com.maximum.numbers;

public class MaximumNumbers {

	public Integer maximumNumber(Integer num1, Integer num2, Integer num3) {
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			return num1;
		else if (num2.compareTo(num3) > 0 && num2.compareTo(num1) > 0)
			return num2;
		else
			return num3;
	}

	public Float maximumNumber(Float num1, Float num2, Float num3) {
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			return num1;
		else if (num2.compareTo(num3) > 0 && num2.compareTo(num1) > 0)
			return num2;
		else
			return num3;

	}

	public String maximumNumber(String string1, String string2, String string3) {
		if (string1.compareTo(string2) > 0 && string1.compareTo(string3) > 0)
			return string1;
		else if (string2.compareTo(string3) > 0 && string2.compareTo(string1) > 0)
			return string2;
		else
			return string3;

	}

}
