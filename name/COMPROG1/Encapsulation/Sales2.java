package Encapsulation;

import java.util.*;

public class Sales2 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sales s = new Sales();
		

		System.out.print("Enter the price of the product: ");
		double price = input.nextDouble();
		System.out.print("Enter the discount rate: ");
		double discountRate = input.nextDouble();
		if (discountRate > 100) {
			System.out.println();
			System.out.println("-------------------Error discount rate-----------------------");
			System.out.println();
		}else {
			s.setP1(price);
			s.setP2(discountRate);
			
			double discountedprice1 = discountRate/100 * price;
			double discountedprice2 = price - discountedprice1;
			
			System.out.print("The discount is: " + discountedprice2);
			
		}

	}

}
