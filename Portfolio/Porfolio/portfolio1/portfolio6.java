package portfolio1;

import java.util.*;


public class portfolio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int X[][] = {{2,150,3,9,3,-9,100,-8,-50,40}, 
				     {22,11,-6,23,89,23,10,-3,25,-3},
				     {-8,-43,56,100,32,100,-9,5,20,91}, 
				     {-1,2,-3,4,5,6,7,8,9,10}}; 
		
		int row, sumA = 0, jA, iA;
	    System.out.print("Enter the row number [1-4]: ");
	    row = scanner.nextInt();
	    for (jA = row-1;jA < row; jA++) {
	    	for (iA=0; iA<10; iA++) {
	    		sumA = X[jA][iA] + sumA;		
	    	}
	    }
	    	
		}}

