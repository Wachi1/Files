package EA_FINALS_1;

public class Operation {

	public static void main(String[] args) {
		exp1 sum1 = new exp1();
		exp2 sum2 = new exp2();
	
		int sumexp1,sumexp2;
		sumexp1 = sum1.a1 + sum1.b1;
		sumexp2 = sum2.a2 + sum2.b2;
		
		if(sum1.a1 > sum1.b1) {
			System.out.println("The sum of the operation 1 is : " + sumexp1);
			System.out.println("The largest number in operation 1 is : " + sum1.a1);	
		}
		else {
			System.out.println("The sum of the operation 1 is : " + sumexp1);
			System.out.println("The largest number in operation 1 is : " + sum1.b1);	
		}
	
		System.out.println();
		
		if(sum2.a2 > sum2.b2) {
			System.out.println("The sum of the operation 2 is : " + sumexp2);
			System.out.println("The largest number in operation 2 is : " + sum2.a2);	
		}
		else {
			System.out.println("The sum of the operation 2 is : " + sumexp2);
			System.out.println("The largest number in operation 2 is : " + sum2.b2);	
		}
		

	}

}
