package day1;

import java.util.Scanner;

public class Grade {
	
	static String markGrad(int marks) {
		String grade="Grade D";
		switch(marks/10) {
		case 9: case 10:
			grade="Grade A";
            break;

		case 7: case 8:
            grade="Grade B";
            break;

		case 6:
            grade="Grade C";
            break;
           
		default : //optional
            grade="Grade D";
            break; //optional
		}
	
	return grade;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int marks;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter marks");
		marks = scanner.nextInt();
		Grade.markGrad(marks);
		scanner.close();
		
	}


	
}
