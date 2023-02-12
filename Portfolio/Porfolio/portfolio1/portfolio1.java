package portfolio1;

import java.util.Scanner;

public class portfolio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean acc = false;
		String user = "wachi" ,username;
		String pass = "12345",password;
		
		System.out.print("Enter your username: ");
		username = scan.next();
		System.out.print("Enter your password: ");
		password = scan.next();
		
		for(int i = 0; i<1; i++) {
			if(user.equalsIgnoreCase(username) && pass.equals(password)){
				acc = true;
				break;
				}
		}
		
			if(acc) {
				System.out.println("Welcome "+ user);
			}else {
				System.out.println("Account doesn't exist");
			}

		
		
		
		
		
		
		
		
		
	}

}
