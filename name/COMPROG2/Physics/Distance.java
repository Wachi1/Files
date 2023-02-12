package Physics;

public class Distance {

	public static void main(String[] args) {
		
		System.out.println("1.Superman travels 2000m/s. Compute and display (in km) how far he will travel for an hour.\n");
	
		int speed = 2000;
		int convertime = 60/1;
		int convertime1 = 60 * convertime;
		int distancem = speed * convertime1;
		int distancekm = distancem / 1000;
		
		System.out.println("---------------------------------------------------------------|");
		System.out.println("The distance travelled by superman is "+ distancekm + " km");
		System.out.println("---------------------------------------------------------------|\n");

		
		
	
	
	}

}
