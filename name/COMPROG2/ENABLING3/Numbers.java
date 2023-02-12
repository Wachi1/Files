package ENABLING3;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		int negative = 0, positive = 0, zeros = 0;
		
		for(int i = 1; i <= 10; i++) {
		System.out.println("Input number: ");
		int value = input1.nextInt();
		
		
		if(value < 0) {
			negative++;
		}
		if(value > 0) {
			positive++;
		}
		if(value == 0) {
			zeros++;
		}



}
		System.out.println("Number of positive number: " + positive++);
		System.out.println("Number of negative number: " + negative++);
		System.out.println("Number of zeros: " + zeros++);
		
}
}