package Problemset1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
	Scanner nums = new Scanner(System.in);
		
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
		
		if (number1 == number2 && number3 == number2) {
			System.out.println("All numbers are the same");
		}
		else if (number1 == number3){
			System.out.println("The unique number is " + number2);
		}
		else if (number1 == number2 || number2 == number1) {
			System.out.println("The unique number is " + number3);
		}
		else if (number2 == number3 || number3 == number2) {
			System.out.println("The unique number is " + number1);
		}
		else if (number1 > number2) {
			System.out.println("The largest number is " + number1);
		}
		else if (number2 > number3) {
			System.out.println("The largest number is " + number2);
		}
		else {
			System.out.println("The largest number is " + number3);
		}
		}
		}
	

