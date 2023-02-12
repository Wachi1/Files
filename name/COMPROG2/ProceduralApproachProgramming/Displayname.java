package ProceduralApproachProgramming;

import java.util.Scanner;

public class Displayname {

	public static void main(String[] args) {
		
		
		String StudentName;
		String StudentCourse;
		String StudentNumber;
		
		System.out.println("Student Name:");
		Scanner Name = new Scanner(System.in);
		StudentName = Name.nextLine();
		System.out.println("Student Course:");
		Scanner Course = new Scanner(System.in);
		StudentCourse = Course.nextLine();
		System.out.println("Student Number");
		Scanner Number = new Scanner(System.in);
		StudentNumber = Number.nextLine();
	
		System.out.println("-------------------------------------------");
		
		System.out.println("Your name is "+ StudentName);
		System.out.println("Your course is "+ StudentCourse);
		System.out.println("Your student number is "+ StudentNumber);
		
		System.out.println("-------------------------------------------");
		
		
	}

}
