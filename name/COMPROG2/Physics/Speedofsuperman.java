package Physics;

import java.util.Scanner;

public class Speedofsuperman {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------------------------------------------------------------|");
		System.out.println("2.	Input the speed of Superman in (m/s). Compute and display (in min) how long it would take him to travel 50km.");
		System.out.println("--------------------------------------------------------------------------------------------------------------------|");
		
		int speed;
		System.out.println("Input the speed of superman in m/s: ");
		Scanner superman = new Scanner(System.in);
		speed = superman.nextInt();
		
		int kmtom = 50 * 1000;
		int time = kmtom / speed;
		System.out.println("-------------------------------------------------------------------------------------------|");
		System.out.println("Superman had taken "+ time +" minutes to travel 50km with the speed of "+ speed +" m/s ");
		System.out.println("-------------------------------------------------------------------------------------------|");
		
	}

}
