package com.maximum.numbers;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumbers {
//	static MaximumNumbers maxNum;
//
//	@BeforeClass
//	public static void maximumNumberObj() {
//		maxNum = new MaximumNumbers();
//		System.out.println("In Before Class");
//	}
//
//	@AfterClass
//	public static void nullObj() {
//		maxNum = null;
//		System.out.println("In After Class");
//	}

	@Test
	public void givenThreeIntegers_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = MaximumNumbers.maximumNumber(30, 15, 20);
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = MaximumNumbers.maximumNumber(15, 30, 20);
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		Integer maximumValue = MaximumNumbers.maximumNumber(20, 15, 30);
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		Float maximumValue = MaximumNumbers.maximumNumber(50.5f, 30.7f, 10.5f);
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		Float maximumValue = MaximumNumbers.maximumNumber(30.7f, 50.5f, 10.5f);
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		Float maximumValue = MaximumNumbers.maximumNumber(30.7f, 10.5f, 50.5f);
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		String maximumValue = MaximumNumbers.maximumNumber("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		String maximumValue = MaximumNumbers.maximumNumber("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		String maximumValue = MaximumNumbers.maximumNumber("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", maximumValue);
	}

}
