package Assignment_number2;

import java.util.Scanner;

public class Uniquenumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numb1;
		int numb2;
		int numb3;
		
		System.out.println("Input your 3 numbers: ");
		Scanner num1 = new Scanner(System.in);
		numb1 = num1.nextInt();
		Scanner num2 = new Scanner(System.in);
		numb2 = num2.nextInt();
		Scanner num3 = new Scanner(System.in);
		numb3 = num3.nextInt();
		
		if (numb1 == numb2) {
			System.out.println("Not a unique number");
		}
		else if(numb2 == numb3) {
			System.out.println("Not a unique number");
		}
		else if(numb3 == numb1) {
			System.out.println("Not  a unique number");
		}
		else if(numb3 == numb2) {
			System.out.println("Not a unique number");
		}
		else {
			System.out.println("A unique number");
		}
		
	}

}
