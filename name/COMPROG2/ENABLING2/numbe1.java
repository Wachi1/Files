package ENABLING2;

import java.util.Scanner;

public class numbe1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);

		int s1;
		int s2;

		System.out.println("Input your first voltage: ");
		Scanner v = new Scanner(System.in);
		s1 = v.nextInt();
		
		System.out.println("Input your second voltage: ");
		Scanner v1 = new Scanner(System.in);
		s2 = v1.nextInt();
		
		if(s1 == 5) {
			 System.out.println("SWITCH 1: LED ON");
		 }
		 if(s1 != 5) {
			 System.out.println("SWITCH 1: LED OFF");
		 }
		 if (s2 == 5) {
				 System.out.println("SWITCH 2: LED ON");		 
		 }
		 if (s2 != 5) {
				 System.out.println("SWITCH 2: LED OFF");

}


}

}
