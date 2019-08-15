package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorTest {

	@Test
	public void testMarkToGrade() {
		String actual = MarkValidator.markGrade(90);
		String expected = "A";
		assertEquals(actual,expected);
		
	}

	@Test
	public void testMarkToGrades() {
		String actual = MarkValidator.markGrade(40);
		String expected = "C";
		assertEquals(actual,expected);
	}	
	
}
