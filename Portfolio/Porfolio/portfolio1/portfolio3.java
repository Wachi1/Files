package portfolio1;

import java.util.Scanner;

public class portfolio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String a = "Reuse",a1;
	
		
		for(int i = 3; i>0;i--) {
			System.out.println("What is the other term for use?");
			System.out.print("Answer:");
			a1 = s.next();
			System.out.println();
			
			if(a.equalsIgnoreCase(a1)) {
				System.out.println();
				System.out.println("You're correct! You won the game!");
				break;
			}else {
				System.out.println("You lost with lives of "+ i);
				System.out.println();
			}	
		}
		
		
		
		
		
	}
	}
	
