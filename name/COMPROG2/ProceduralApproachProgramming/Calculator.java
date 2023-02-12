package ProceduralApproachProgramming;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int payment;
		int age;
		float discount = 0.20f;
		float tax = 0.30f;
		Scanner i = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------|");
		System.out.println("Good day! Shoppers!");
		System.out.println("Our shop currently providing 20% of discount to senior citizen");
		System.out.println("Shop now!");
		System.out.println("-------------------------------------------------------------------|");
		
		int item1;
		System.out.println("Price of the 1st item:");
		Scanner i3 = new Scanner(System.in);
		item1 = i3.nextInt();
		
		int item2;
		System.out.println("Price of the 2nd item:");
		Scanner i2 = new Scanner(System.in);
		item2= i2.nextInt();
		
		int item3;
		System.out.println("Price of the 3rd item:");
		Scanner i1 = new Scanner(System.in);
		item3 = i1.nextInt();
			
		System.out.println("How much will you pay?");
		Scanner payment1= new Scanner(System.in);
		payment = payment1.nextInt();
		
		System.out.println("Please input your age: ");
		Scanner age1= new Scanner(System.in);
		age = age1.nextInt();
		
		float totalofitems =  item1 + item2 + item3;
		float paymentntax = totalofitems * tax;
		float paymenttax = totalofitems - paymentntax;
		float paymentndiscount = totalofitems * discount;
		float totalchange1 = paymentndiscount + paymentntax;
		float paymentsenior = totalofitems - totalchange1;
		
		System.out.println("--------------------------------------------------------------|");
		if (paymentsenior > payment) {
			System.out.println("Insufficient balance");
		}
		else if (age >= 60) {
			System.out.println("The total change including the tax and discount is ");
			System.out.println(payment - paymentsenior);
		}
		else if (paymenttax > payment){
			System.out.println("Insufficient balance");
		}
		else if (age <= 59) {
			System.out.println("The total change including the tax is ");
			System.out.println(payment - paymenttax);	
		}
		else {
			System.out.println("Insufficient balance");
		}
		System.out.println("-------------------------------------------------------------|");
			
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
			
			

			

			
		



	


