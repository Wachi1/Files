package Assignment_number2;

import java.util.Scanner;

public class Ageofperson {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		int a;
		
		System.out.println("Input your given age: ");
		a = i.nextInt();
		
		if(a >= 60) {
			System.out.println("You are a senior citizen with the age of "+ a);
		}
		else if(a > 17) {
			System.out.println("You are legal with the age of "+ a);
		}
		else if(a <= 17) {
			System.out.println("You are a minor with the age of "+ a);
		}
	}

}
