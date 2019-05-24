package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {{
		
	ArrayList<Integer> answers = new ArrayList<Integer>();
	int ultimateAnswer = 42;
	answers.add(ultimateAnswer);
	answers.add(86);
	 
	System.out.println("The answers are: " + answers);
	 
	Integer asIntegerObject = ultimateAnswer;
	System.out.println("The ultimate answer is " + asIntegerObject);
	}
	
	String[] myTools = { "hammer", "shovel", "wrench" };
	for(int index = 0; index < myTools.length; index++) {
	  if(myTools[index].equals("shovel")) {
	      System.out.println("Shovel is element " + index);
	  }
	  ArrayList<String> giantWords = new ArrayList<String>();
	  giantWords.add("fee");
	  giantWords.add("fie");
	  giantWords.add("foe");
	  System.out.println(giantWords);
	  System.out.println("my list has " + giantWords.size() + " elements");
	   
	  giantWords.add("fum");
	  System.out.println(giantWords);
	  System.out.println("my list has " + giantWords.size() + " elements");

	}}}
