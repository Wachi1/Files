package ENABLING2;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		  Scanner input= new Scanner(System.in);
	       
		  double pre;
		  double mid;
		  double fin;
		  double pass;
		  double ave;
		  
		    System.out.print("Enter prelim grade: ");
	        pre = input.nextDouble();
	        System.out.print("Enter midterm grade: ");
	        mid = input.nextDouble();
	        System.out.print("Enter final grade: ");
	        fin = input.nextDouble();
	        System.out.print("Enter passing rate: ");
	        pass = input.nextDouble();
	       
	        ave = (pre + mid + fin) /4; 
	       
        	System.out.println("The average is: " + ave);
	        
	        if(ave <= pass){
	        	System.out.print("Remarks: FAILED!");
	        }else{
	        	System.out.print("Remarks: PASSED!");
	        }
	    }
	}
