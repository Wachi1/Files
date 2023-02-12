package Problemset1;

import java.util.Scanner;

public class Dormitory {

	public static void main(String[] args) {
		Scanner dormitory = new Scanner(System.in);
		
		double dormrate;
		double andrew;
		double andrei;
		double andres;
		double dorm;
		double dorm2;
		double dorm3;
		double year;
		
		System.out.println("Input the monthly dormitory rate: ");
		dormrate = dormitory.nextDouble();
		
		andrew = 0.40;
		andrei= 0.35;
		andres = 0.25;
		
		dorm = andrew * dormrate * 10;
		dorm2 = andrei * dormrate * 10;
		dorm3 = andres * dormrate * 10;
		year = dormrate * 10;
		
		System.out.println("-----------------------------------------------------------------|");
		System.out.println("The total rent in the dormitory for the whole year is " + year);
		System.out.println("-----------------------------------------------------------------|");
		System.out.println("The total contribution of andrew is " + dorm );
		System.out.println("The total contribution of andrei is " + dorm2 );
		System.out.println("The total contribution of andres is " + dorm3);
		
	}

}
