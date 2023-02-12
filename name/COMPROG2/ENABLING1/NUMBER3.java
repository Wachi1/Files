package ENABLING1;

import java.util.Scanner;

public class NUMBER3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("------------------------------------------------------------------|");
		System.out.println("Good day! Shoppers!");
		System.out.println("Our shop currently providing 20% of discount");
		System.out.println("Shop now!");
		System.out.println("-------------------------------------------------------------------|");
		
		
		float totalcost;	
		System.out.println("How much the total cost?");
		totalcost = input.nextInt();
	
		float payment;
		System.out.println("How much will you pay?");
		payment = input.nextInt();
	
		
		float discount = 0.20f;
		float paymentndiscount = totalcost * discount;
		float discount2 = totalcost - paymentndiscount;
		float change = payment - discount2;
		

		System.out.println("The total price of the items with discount is: " + discount2);
		System.out.println("Your payment is: " + payment );
		System.out.println("Your change is: " + change );
			
}	
		
	}


