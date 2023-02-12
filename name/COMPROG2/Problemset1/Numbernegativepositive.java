package Problemset1;

import java.util.Scanner;

public class Numbernegativepositive {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		int number1;
	
		System.out.println("Enter your number: ");
		number1 = number.nextInt();
		number.close();
		
		if (number1 > 0) {
			System.out.println("POSITIVE");
		}
		else if (number1 < 0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("ZERO");
		}
	}

}
