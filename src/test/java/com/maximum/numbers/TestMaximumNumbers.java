package com.maximum.numbers;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMaximumNumbers {
	static MaximumNumbers maxNum;

	@BeforeClass
	public static void maximumNumberObj() {
		maxNum = new MaximumNumbers();
		System.out.println("In Before Class");
	}

	@AfterClass
	public static void nullObj() {
		maxNum = null;
		System.out.println("In After Class");
	}

	@Test
	public void givenThreeIntegers_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = maxNum.maximumNumber(10, 9, 8);
		Assert.assertEquals((Integer) 10, maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = maxNum.maximumNumber(9, 10, 8);
		Assert.assertEquals((Integer) 10, maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = maxNum.maximumNumber(9, 8, 10);
		Assert.assertEquals((Integer) 10, maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		Float maximumValue = maxNum.maximumNumber(10.5f, 9.5f, 8.5f);
		Assert.assertEquals((Float) 10.5f, maximumValue);
	}

}
