package day1;

import java.util.*;
import java.lang.Double;

public class Temperature {
	Double celsius;
	Double fahrenheit;
	Temperature(int t, Double temperature)
	{
		switch (t) {
		case 1: convertToFahrenheit(temperature);
			break;
		case 2: convertToCelsius(temperature);
			break;
		default: System.out.println("Invalid Choice");
		
		}
	}
		
		Double convertToFahrenheit(Double celsius) {
			
			fahrenheit = (celsius*9/5)+32;
			System.out.println("Temperature in fahrenheit = " +fahrenheit);
			return fahrenheit;
		}
		
		Double convertToCelsius(Double fahrenheit) {
			
			celsius = (fahrenheit-32)*5/9;
			System.out.println("Temperature in celsius = " +celsius);
			return celsius;
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		Double temperature;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 : Celsius to Fahrenheit \n2 : Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		input=scanner.nextInt();
		System.out.println("Enter the temperature");
		temperature = scanner.nextDouble();
		new Temperature(input,temperature);
		scanner.close();
	}
	
}
