package day1;

public class Factorial {

	static int calculateFactorial(int num) {
		int i, fact = 1;
		for (i=1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calculateFactorial(5));
		
	}

}



