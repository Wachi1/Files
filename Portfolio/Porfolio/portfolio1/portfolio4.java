package portfolio1;

import java.util.Scanner;

public class portfolio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String user;
		String pass;
		boolean acc = false;
		
		String username [] = {"Wachi","Mark"};
		String password [] = {"1234","4567"};

		System.out.println("Input your username: ");
		user = s.next();
		System.out.println("Input your password: ");
		pass = s.next();
		
		

		for(int i = 0; i<username.length; i++) {
			if(user.equalsIgnoreCase(username[i]) && pass.equals(password[i])){
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

