package MIDTERM;

import java.util.*;

public class MIDTERM {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the students: ");
		
		int Numberofstu = input.nextInt();
		int grade[] = new int[Numberofstu];
		float sum = 0;
		
		for (int i=0; i < Numberofstu; i++) {
			System.out.print("Enter the grade of the student "+ (i+1) +": ");
			grade[i] = input.nextInt();}
	
		System.out.print("The grades are: [");
		for (int i = 0; i < Numberofstu; i++) {
		if (i == Numberofstu - 1 ) {
			System.out.print(grade[i] + "]");
			System.out.println();
			}else {System.out.print(grade[i] + ", ");}	
		
		sum += grade[i];}
		
		float m = average(sum,Numberofstu);
		System.out.print("The average is: ");
		System.out.printf("%.2f", m);
		System.out.println();
		System.out.print("The median is: ");
		System.out.printf("%.2f", median(grade, Numberofstu));
		System.out.println();
		System.out.println("The minimum is: " + grade[0]);
		System.out.println("The maximum is: " + grade[Numberofstu -1]);
		System.out.print("The standard deviation is: ");
		System.out.printf("%.02f", stddev(Numberofstu, m, grade));
		System.out.println();
}		


	public static float average(float sum, int Numberofstu) {
		float ave = 0;
		ave = sum/Numberofstu;
		return ave;
	}
	public static float median(int[] grade, int num) {
		
		Arrays.sort(grade);
		 
		 float median = 0;
		 int temp = 0;
		 
		 if (num % 2 == 1) { temp = num/2; median = grade[temp];}
		 else {temp= num/2; median = (grade[temp-1] + grade[temp]) / 2;}
		return median;
				 

	}public static float stddev(int Numberofstu, float m, int[] grade){
		 Arrays.sort(grade);
		 double dev = 0;
		 float sum = 0;
		 
		 for (int i = 0; i < Numberofstu; i++) {
		 float dev2 = 0;
		 float dev3 = 0;
		 
		 dev2 = (grade[i] - m);
		 
		 if (dev2 < 0) {
		 dev2 *= -1;
		 }
		 
		 dev3 = dev2 * dev2;
		 sum += dev3;
		 }
		 
		 dev = Math.sqrt(sum/Numberofstu);
		 
		 return (float) dev;
		 }
		
	}

	
	


