package loops;

import java.util.Scanner;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
//		int count = 1;
//		while(count <= 10) {
//		  System.out.println("Count is " + count);
//		  count++;
//		}
//		
//	for(count = 1; count<=10; count ++) {
//		System.out.println("Count is " + count);
//	}
	for (String r = "plop"; !r.equals("plot");r = input.nextLine()) {
	System.out.println("What should I do?");
	}
	System.out.println("Okay, I quit!");
	
	String name = "Ohio";
	for(int i = 0; i<name.length(); i ++) {
		System.out.println((name.charAt(i)));
	}
	for(int i = name.length()-1; i >=0; i--) {
		System.out.println(name.charAt(i));
	}
	for (int num = 0; num<=8; num ++) {
		System.out.println(+ num); }
	System.out.println("I just counted to 8!");
	
	}}

