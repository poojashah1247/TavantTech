package day1;

import java.util.*;
import java.lang.Double;

public class Temperature {
	static Double celsius;
	static Double fahrenheit;
	private static Scanner sc;
	Temperature(int t, Double temp)
	{
		switch (t) {
		case 1: convertToFahrenheit(temp);
			break;
		case 2: convertToCelsius(temp);
			break;
		default: System.out.println("Invalid Choice");
		
		}
	}
		
		static Double convertToFahrenheit(Double celsius) {
			
			fahrenheit = (celsius*9/5)+32;
			System.out.println("Temperature in fahrenheit = " +fahrenheit);
			return fahrenheit;
		}
		
		static Double convertToCelsius(Double fahrenheit) {
			
			celsius = (fahrenheit-32)*5/9;
			System.out.println("Temperature in celsius = " +celsius);
			return celsius;
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ip;
		Double temp;
		sc = new Scanner(System.in);
		System.out.println("1 : Celsius to Fahrenheit \n2 : Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		ip=sc.nextInt();
		System.out.println("Enter the temp");
		temp = sc.nextDouble();
		new Temperature(ip,temp);
	}
	
}
