package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test1() {
		int actual = SumOfNumbers.sumOfEvenNumbers(1,10);
		int expected = 30;
		assertEquals(actual,expected);
	}
	
	@Test
	public void test2() {
		int actual = SumOfNumbers.sumOfOddNumbers(1,10);
		int expected = 25;
		assertEquals(actual,expected);
		
	}
}
