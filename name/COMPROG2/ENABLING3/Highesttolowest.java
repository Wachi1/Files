package ENABLING3;

import java.util.Scanner;

public class Highesttolowest {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.println("Input your 5 numbers lowest to highest");
		 
		 boolean res = true;
		 String res1="";
		 do {
		 int[] num= new int[5];
		 int smallest = Integer.MAX_VALUE;
		 int largest =Integer.MIN_VALUE;
		 int smallest1 = 0;
		 
		 for(int i =0;i<5;i++) {
		 System.out.print("Enter item value no 1 value : ");
		 num[i]=input.nextInt();
		 
		 if(num[i] < smallest) {
		 smallest = num[i];
		 }
		 
		 if (num[i] > largest) {
		 largest = num[i];
		 }
		 }
		 if(num[1]< num[2]) {
		 
		 }
		 
		 System.out.println();
		 System.out.println("The Smallest number is: " + smallest );
		 System.out.println("The next is: " + num[1]);
		 System.out.println("The next is: " + num[2]);
		 System.out.println("The next is: " + num[3]);
		 System.out.println("The Largest number is: " + largest );
		 System.out.println();
		 System.out.println("Try Again (Yy/Nn)");
		 
		 input.nextLine();
		 res1 = input.nextLine();
		}while("Yy".equalsIgnoreCase(res1));
		}}


