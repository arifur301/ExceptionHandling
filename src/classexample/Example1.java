package classexample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numerator:");
		int numerator = scanner.nextInt();
		double division = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a denominator:");
			int denominator = scanner.nextInt();
			try {
				 division = numerator / denominator;
			} catch (ArithmeticException e) {
				System.out.println("0 IS NOT EXCEPTED");
			}
			if(denominator !=0) {
				break;
			}
		}
		System.out.println("The result of dividing those numbers: " + division);
	}
}
