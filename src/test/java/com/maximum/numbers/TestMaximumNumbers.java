package com.maximum.numbers;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumNumbers {

	@Test
	public void givenFiveIntegers_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(30, 15, 20, 85, 62);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(85), maximumValue);
	}

	@Test
	public void givenFourIntegers_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(15, 30, 20, 45);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(45), maximumValue);
	}

	@Test
	public void givenThreeIntegers_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Integer> integerMaximumNumber = new MaximumNumbers<>(30, 45, 25);
		Integer maximumValue = integerMaximumNumber.testMaximum();
		Assert.assertEquals(Integer.valueOf(45), maximumValue);
	}

	@Test
	public void givenFourFloat_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(50.5f, 25.5f, 30.7f, 10.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(50.5f), maximumValue);
	}

	@Test
	public void givenThreeFloat_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(30.7f, 50.5f, 60.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(60.5f), maximumValue);
	}

	@Test
	public void givenFiveFloat_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<Float> floatMaximumNumber = new MaximumNumbers<>(30.7f, 10.5f, 66.7f, 24.3f, 50.5f);
		Float maximumValue = floatMaximumNumber.testMaximum();
		Assert.assertEquals(Float.valueOf(66.7f), maximumValue);
	}

	@Test
	public void givenFourStrings_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Peach", "Apple", "Banana", "Orange");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenThreeStrings_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Apple", "Peach", "Banana");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

	@Test
	public void givenFiveStrings_MaxAtAnyPosition_ShouldReturnMaximumNumber() {
		MaximumNumbers<String> stringMaximumNumber = new MaximumNumbers<>("Apple", "Banana", "Peach", "Mosambi",
				"Grapes");
		String maximumValue = stringMaximumNumber.testMaximum();
		Assert.assertEquals("Peach", maximumValue);
	}

}
