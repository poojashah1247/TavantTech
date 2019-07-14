package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		
		String actual = HelloWorld.getMessage();
		String expected = "Hello world!";
		assertEquals(actual,expected);
	}

}
