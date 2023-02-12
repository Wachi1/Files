package portfolio1;

import java.util.Scanner;

public class portfolio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String names [] = new String[3];
		String password [] = new String[3];
		String email [] = new String[3];
		
		System.out.println("Input 3 random names: ");
		names[0] = scan.next();
		names[1] = scan.next();
		names[2] = scan.next();
		
		System.out.println("Input 3 passwords: ");
		password[0] = scan.next();
		password[1] = scan.next();
		password[2] = scan.next();
		
		System.out.println("Input 3 emails: ");
		email[0] = scan.next(); 
		email[1] = scan.next();
		email[2] = scan.next();
		
		int i = 0;

			System.out.println(names[i]);
			System.out.println(password[i]);
			System.out.println(email[i]);
			
		}
		
		
	}

