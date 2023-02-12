package ENABLING2;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		  Scanner input= new Scanner(System.in);
	       
		  double prelim;
		  double midterm;
		  double finals;

		  double ave;
		  
		    System.out.print("Enter prelim grade of student A: ");
	        prelim = input.nextDouble();
	        System.out.print("Enter midterm grade of student A: ");
	        midterm = input.nextDouble();
	        System.out.print("Enter final grade of student A: ");
	        finals = input.nextDouble();
	        
	        ave = (prelim + midterm + finals) /3; 
	        
	      double prelim2;
	      double midterm2;
	      double finals2;
	      double ave2;
	      
	      System.out.print("Enter prelim grade of student B: ");
	      prelim2 = input.nextDouble();
	      System.out.print("Enter midterm grade of student B: ");
	      midterm2 = input.nextDouble();
	      System.out.print("Enter final grade of student B:  ");
	      finals2 = input.nextDouble();
	   
	      ave2 = (prelim2 + midterm2 + finals2) /3; 
	      

	      if(ave > ave2) {
	    	  System.out.println();
	    	  System.out.println("The average of student A has the highest grade");
	    	  System.out.println("The average is: " + ave);
	    	  System.out.println();
	      }else if(ave2 > ave){
	    	  System.out.println();
	    	  System.out.println("The average of student B has the highest grade");
	    	  System.out.println("The average is: " + ave2);
	    	  System.out.println();
	    	  
	      }else if(ave2 == ave) {
	    	  System.out.println();
	    	  System.out.println("The average of student A has the same average of student B");
	    	  System.out.println("The average is: " + ave);
	    	  System.out.println();
	      }
	      
	      
	        
	}

}
