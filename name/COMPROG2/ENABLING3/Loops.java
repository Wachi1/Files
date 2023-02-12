package ENABLING3;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
		
		Scanner i1 = new Scanner(System.in);
		
		boolean tryagain;
		do {	
		
			System.out.println("Enter any number and the program will display the odd and the even numbers: ");

			int n, codd = 0, ceven = 0;
			int aodd = 0, aodd1, aeven = 0, aeven1;
		
			n = i1.nextInt();
			for(int lodd = 1 ; lodd <= n; lodd++) {
			if(lodd%2 == 1) {
				System.out.println(lodd + " is an odd number. ");
				aodd = aodd + lodd;
				codd++;
}}
		System.out.println("---------------------------------------------------|");
		aodd1 = aodd / codd;
		System.out.println("The mean of the odd is " + aodd1);
		System.out.println("---------------------------------------------------|");
		
		
		    for(int leven = 1 ; leven <= n; leven++) {
			if(leven%2 == 0) {
				System.out.println(leven + " is an even number. ");	
				aeven = aeven + leven;
				ceven++;
				
}}
		System.out.println("---------------------------------------------------|");
		aeven1 = aeven / ceven;
		System.out.println("The mean of the even is " + aeven1);
		System.out.println("---------------------------------------------------|");
		System.out.println("Try Again (True/False)");
		tryagain =	i1.nextBoolean();
		
		}while (tryagain == true );
		
		
		
	}}
