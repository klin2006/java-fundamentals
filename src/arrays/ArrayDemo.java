package arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many favorite vacation spots do you have?");
		
		int favorites = input.nextInt();
		
		String []vacationSpot = new String [favorites];
		
		
		System.out.println("Well, what are these favorite spots?");
		
		for(int i = 0; i<vacationSpot.length; i++ ) {
			vacationSpot[i] = input.next();
			
		}
		System.out.println(vacationSpot[0]);
		System.out.println(vacationSpot[vacationSpot.length-1]);
//		String [] vacationSpot = new String[4];
//		System.out.println("What are your favorite vacation spots?");
//		vacationSpot[0] = input.nextLine();
//		vacationSpot[1] = input.nextLine();
//		vacationSpot[2] = input.nextLine();
//		vacationSpot[3] = input.nextLine();
//		
//		System.out.println(vacationSpot[0]);
//		System.out.println(vacationSpot[3]);
		
		String source = "this, that, the other";
		String[] elements = source.split(", ");
		 
		System.out.println(elements[0]); // prints "this"
		System.out.println(elements[1]); // prints "that"
		System.out.println(elements[2]); // prints "the other"
		
		
	
		
		
	}

}
