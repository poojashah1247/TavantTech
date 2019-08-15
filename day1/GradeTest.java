package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeTest {

	@Test
	public void testGrade() {
		String actual = Grade.markGrad(90);
		String expected = "Grade A";
		assertEquals(actual,expected);		
	}


	@Test
	public void testGrades() {
		String actual = Grade.markGrad(70);
		String expected = "Grade A";
		assertEquals(actual,expected);		
	}
}

