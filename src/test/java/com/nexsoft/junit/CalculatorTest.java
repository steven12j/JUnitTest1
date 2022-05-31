package com.nexsoft.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.nexsoft.junit.calculator.Calculator;

public class CalculatorTest {
	
	Calculator calculator;
	int a, b;
	
	@Before
	public void persiapan() {
		calculator = new Calculator();
		a = 1234;
		b = 5678;
	}
	
	@Test
	public void testPenambahan() {
		
		int actual = calculator.penambahan(a, b);
		int expect = 6912;
		
		assertEquals(expect, actual);
	}
	
	@Test
	public void testPengurangan() {
		
		int actual = calculator.penambahan(b, a);
		int expect = 4444;
	}
	
}
