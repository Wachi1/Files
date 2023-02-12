package EA4;


import java.util.Scanner;
public class ACTIVITY1 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
			int i = 0, temp;
			int V[] = new int[5];
			System.out.println("Enter Voltage input between 5 to 10 volts: ");
			while (i < V.length) {
			 temp = input.nextInt();
			 if (temp >= 5 && temp <= 10) {
			 V[i] = temp;
			 i++;
			 }
			 }
			input.close();
			System.out.print("Voltage values: ");
			for (i = 0; i<5; i++) {
			System.out.print(V[i] + " volts, ");
			}
			System.out.println();
			}
		

	}


