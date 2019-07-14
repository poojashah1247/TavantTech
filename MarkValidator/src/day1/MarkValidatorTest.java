package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorTest {

	@Test
	public void test() {
		String actual = MarkValidator.markGrade(90);
		String expected = "A";
		assertEquals(actual,expected);
		
	}

}
