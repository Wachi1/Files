package Problemset1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Input your 3 numbers: ");
		Scanner num1 = new Scanner(System.in);
		number1 = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		number2 = num2.nextInt();
		Scanner num3 = new Scanner(System.in);
		number3 = num3.nextInt();
		
		num1.close();
		num2.close();
		num3.close();
		
		if(number1 == number2){if(number2==number3) {
			System.out.println("All numbers are the same");
		}
		}
		else if(number1 == number2) {
			System.out.println("The unique number is " + number3);
		}
		else if(number3 == number1) {
			System.out.println("The unique number is " + number2);
		}
		else if(number2 == number3) {
			System.out.println("The unique number is " + number1);
		}
		else if(number3 == number2) {
			System.out.println(" The unique number is " + number1);
		}
		else if(number1 > number3) {
			System.out.println(" 1 The input number 1 is has the highest value of " + number1);
		}
		else if(number1 > number2) {
			System.out.println(" 2 The input number 1 is has the highest value of " + number1);
		}
		else if(number2 > number3){
			System.out.println(" 3 The input number 2 has the highest value of " + number2);	
	}
		else if(number3 > number1) {
			System.out.println(" 5 The input number 3 is has the highest value of " + number3);
		}
		else if(number3 > number2) {
			System.out.println(" 6 The input number 3 is has the highest value of " + number3);
		}
		}
}

	
	

