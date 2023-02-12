import java.util.Scanner;

public class ASDASDASD {

	public static void main(String[] args) {
	
		int a,b;
		boolean repeat;
		int X[][] = {{2,150,3,9,3,-9,100,-8,-50,40}, 
				{22,11,-6,23,89,23,10,-3,25,-3},
				{-8,-43,56,100,32,100,-9,5,20,91}, 
				{-1,2,-3,4,5,6,7,8,9,10}}; 
		

		System.out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		for (a = 0; a < 4; a++) {
	    	for (b = 0; b < 10; b++) {
	    		System.out.print("|\t"+X[a][b]+"\t|");	
	    	}
	    	System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		do {
		Scanner scanner = new Scanner(System.in);
		char choice;
		
		
		System.out.println("A - Input the row number, and display the sum of all numbers in that row.");
		System.out.println("B - Input the column number, and display the average of the numbers in that column.");
		System.out.println("C - Display how many are positive and negative numbers.");
		System.out.println("D - Input a number then display how many instances that number is in the array.");
		System.out.print("Enter operation [Case sensitive]: ");
		choice = scanner.next().charAt(0);
		switch(choice) {
		  case 'A': 
			int row, sumA = 0, jA, iA;
		    System.out.print("Enter the row number [1-4]: ");
		    row = scanner.nextInt();
		    for (jA = row-1;jA < row; jA++) {
		    	for (iA=0; iA<10; iA++) {
		    		sumA = X[jA][iA] + sumA;		
		    	}
		    }
		    System.out.println("The Sum of all numbers in your chosen row is: " + sumA);
		    break;
		  case 'B': 
		   int column, jB, iB;
		   double ave = 0;
		   System.out.print("Enter the column number [1-10]: ");
		   column = scanner.nextInt();
		   for (jB = 0; jB < 4; jB++) {
			   for (iB = column-1; iB<column; iB++) {
				   ave = X[jB][iB] + ave;
			   }
		   }
		   System.out.println("The Average of all numbers in your chosen column is: " + ave/4);
		    break;
		  case 'C':
			  int jC, iC, Pcounter=0,Ncounter=0;  
			  for (jC = 0; jC < 4; jC++) {
			    	for (iC = 0; iC < 10; iC++) {
			    		if (X[jC][iC] > 0) {
			    			Pcounter++;
			    		}else {
			    			Ncounter++;
			    		}
			    	}
			    }
			  System.out.println("The total amount of Positive numbers is: " + Pcounter);
			  System.out.println("The total amount of Negative numbers is: " + Ncounter);
			break;
		  case 'D':
			  int jD, iD, num, Numcounter=0;  
			  System.out.println("Enter the number you wish to count: ");
			    num = scanner.nextInt();
			  for (jD = 0; jD < 4; jD++) {
			    	for (iD = 0; iD < 10; iD++) {
			    		if (X[jD][iD] == num) {
			    			Numcounter++;
			    		}
			    	}
			    }
			  System.out.println("The total amount of times your number, " + num + ", appeared is: " + Numcounter);
			break;
		  default:
		    System.out.print("Error, answer was not part of the choices given");
		  
		}
		System.out.println("Try again? [True/False]");
		repeat = scanner.nextBoolean();
		}while(repeat == true);
	}
}




