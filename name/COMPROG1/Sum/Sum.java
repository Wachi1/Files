package Sum;

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		int a;
		
		System.out.println("Enter two numbers: ");
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
			
		Constructor s = new Constructor();
		
		s.setN1(input1.nextInt());
		s.setN2(input2.nextInt());
		
		
		a = addition(s.getN1(),s.getN2());
		
		System.out.println("The addition of two numbers is : " + a);

	}

	private static int addition(int a, int b) {
		return a+b;
	}

}
