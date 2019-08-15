package day1;

import java.util.Scanner;

public class MarkValidator {
	public boolean isPass(int mark) {
		if (mark>=40)
			return true;
		else
			return false;
		
	}

	static String markGrade(int mark) {
		String grade;
		if (mark>=90) {
			grade="A";
		}
		else if (mark>=75) {
			grade="B";
		}
		else if (mark>=60) {
			grade="C";
		}	
		else {
			grade="D";
		}
		return grade;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the marks");
		mark=scanner.nextInt(); 
		MarkValidator object = new MarkValidator();
		object.isPass(mark);
		MarkValidator.markGrade(mark);
		scanner.close();
	}
	
}
