package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void test1() {
		Double actual = Temperature.convertToFahrenheit(0.0);
		Double expected = 32.0;
		assertEquals(actual,expected);
	}

	@Test
	public void test2() {
		Double actual = Temperature.convertToCelsius(32.0);
		Double expected = 0.0;
		assertEquals(actual,expected);
	}

}
