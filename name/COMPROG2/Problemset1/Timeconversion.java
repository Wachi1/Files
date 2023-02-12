package Problemset1;
 
import java.util.*;

public class Timeconversion {

	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		
		float hr;
		float second;
		float mins;
		float day;
		float week;
		
		System.out.println("Input the number of hours:");
		hr = time.nextFloat();
		
		mins = hr * 60;
		second = hr * 3600;
		day = hr / 24;
		week = hr / 168;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------|" );
		System.out.println("The equivalent of " + hr + " in seconds is " + second + " in minutes is " + mins + " in days is " + day + " in a week is " + week);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------|" );
		
		
		
		
		
	}

}
