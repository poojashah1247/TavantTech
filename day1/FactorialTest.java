package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testPositiveFactorial() {
		int actual= Factorial.calculateFactorial(5);
		int expected=120;
		assertEquals(expected,actual);
	}

	@Test
	public void testNegativeFactorial() {
		int actual= Factorial.calculateFactorial(-5);
		int expected=120;
		assertEquals(expected,actual);
	}
}
