package day1;

public class SumOfNumbers {
	
		
		public static int sumOfEvenNumbers(int startNumber, int endNumber) {
			int sum = 0; 
			for (int i=startNumber; i<=endNumber; i++) {
				if (i%2==0)
				sum = sum + i;
			}
			return sum;
				
		}
		
		public static int sumOfOddNumbers( int startNumber, int endNumber) {
			int sum1 = 0;
			for (int i=startNumber; i<=endNumber; i++) {
				if (i%2!=0)
				sum1 = sum1 + i;
		    }
			return sum1;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumOfEvenNumbers(1,10));
		
		System.out.println(sumOfOddNumbers(1,10));
	}
	
}
