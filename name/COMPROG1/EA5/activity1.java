package EA5;

import java.util.Scanner;

public class activity1 {

	public static void main(String[] args) {
		Name();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter Name: ");
		String name = input.nextLine();
		
	displayGreet(name);
		}
	
		public static void Name() {	
		}
		public static void displayGreet(String name) {	
			System.out.println("Hello " + name +"! Have a nice day");
		}
	}


