package ProceduralApproachProgramming;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		System.out.println("----------------------------------------------------|");	
		System.out.println("Choose your operator type: ");
		System.out.println("+ for addition ");
		System.out.println("- for subtraction ");
		System.out.println("* for multiplication ");
		System.out.println("/ for division ");	
		System.out.println("----------------------------------------------------|");	
		
		char operator;
		Double num1, num2, ans;

		System.out.println("Choose your operator type: ");
		Scanner operator1 = new Scanner(System.in);
		operator = operator1.next().charAt(0);
	
		System.out.println("Input your first number: ");
		num1 = operator1.nextDouble();
		
		System.out.println("Input your first number: ");
		num2 = operator1.nextDouble();
		
		switch(operator) {
		
		case '+':
			ans = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + ans);
			break;
		case '-':
			ans = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + ans);
			break;
		case '*':
			ans = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + ans);
			break;
		case '/':
			ans = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + ans);
			break;
			
			default:
				System.out.println("Error");
				break;
		}
		operator1.close();
		
		


	}
		
		
		
	
	
	}
			
		
		
		
		
				
		

	


