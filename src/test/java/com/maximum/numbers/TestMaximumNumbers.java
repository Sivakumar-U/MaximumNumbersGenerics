package com.maximum.numbers;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumbers {

	@Test
	public void givenThreeIntegers_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(30, 15, 20);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(15, 30, 20);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(20, 15, 30);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(30), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(50.5f, 30.7f, 10.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(30.7f, 50.5f, 10.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(30.7f, 10.5f, 50.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtFirstPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Peach", "Apple", "Banana");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtSecondPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Apple", "Peach", "Banana");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenThreeString_MaxAtThirdPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Apple", "Banana", "Peach");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

}
