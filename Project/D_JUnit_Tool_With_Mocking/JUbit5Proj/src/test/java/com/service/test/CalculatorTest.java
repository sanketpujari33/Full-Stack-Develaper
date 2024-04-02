package com.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cal= new Calculator();
		int actualResult =cal.add(10, 5);
		int expectedResult =15;
		assertEquals(expectedResult,actualResult );
	}

	@Test
	void testMultiply() {
		Calculator cal= new Calculator();
		int actualResult =cal.multiply(10,5);
		int expectedResult =50;
		assertEquals(expectedResult,actualResult );
	}

}
