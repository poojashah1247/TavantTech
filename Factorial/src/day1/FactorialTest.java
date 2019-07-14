package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		int actual= Factorial.calculateFactorial(5);
		int expected=120;
		assertEquals(expected,actual);
	}

}
