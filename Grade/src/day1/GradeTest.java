package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	@Test
	public void test() {
		String actual = Grade.markGrad(90);
		String expected = "Grade A";
		assertEquals(actual,expected);
		
	}

}
