package EA5;

import java.util.Scanner;


public class EA5{

	public static void main(String[] args) {
		float l = inputLength();
		float w = inputWidth();
		analyze(l,w);
		compute(l,w);
			
	}

	public static float inputLength() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the length: ");   
		    float l = input.nextFloat();
			return l;
	}
	public static float inputWidth() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the width: ");
		    float w = input.nextFloat();
			return w;
		}
	public static void analyze(float l, float w) {
		if(l == w) {
			System.out.println("The shape is perfect Square");
		}
		else {
			System.out.println("The shape is a Rectangle");
		}
	}
	public static void compute(float l, float w) {
		if(l == w) {
			float as = (l*w);
			float ps  = 2*(l + w);
			System.out.println("The Square's area is "+ as +" and the perimeter is "+ ps);
		}
		else {
			float as = (l * w);
			float ps  = (2*l) + (2*w);
			System.out.println("The Rectangle's area is "+ as +" and the perimeter is "+ ps);
		}
		}
		
	}