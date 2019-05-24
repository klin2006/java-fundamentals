package loops;

import java.util.Scanner;

public class WhileLoopsDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("Please type a message");
//		String message = input.nextLine();
//		int count = 1;
//		while (count <= 5) {
//			System.out.println(message);
//			count ++;	
//		}
//	
//		System.out.println("Guess a number!");
//		int secretNumber = (int)(Math.random()*3+1);
//		int guess = input.nextInt();
//		while(guess!= secretNumber) {
//			System.out.println("Nope, guess again!");
//			guess = input.nextInt();
//		}
//		System.out.println("You got it!");
		
		int numb = input.nextInt();
		int task = 0;
		while(task<=numb) {
			System.out.println(task);
			task ++;
			
		}
		
		input.close();	
		
		

}}
