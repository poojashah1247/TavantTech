package day1;

import java.util.Scanner;

public class MarkValidator {
	void isPass(int mark) {
		if (mark>=40)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
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
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks");
		mark=sc.nextInt(); 
		MarkValidator x = new MarkValidator();
		x.isPass(mark);
		MarkValidator.markGrade(mark);
		sc.close();
	}
	
}
