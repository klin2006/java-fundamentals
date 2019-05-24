package operators;

import java.text.NumberFormat;
import java.util.Locale;

public class OperatorsDemo {

	public static void main(String[] args) {
		
	NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

		
	int sugar = 7;
	System.out.println("Lisa needs " + (sugar - 2) + " more cups.");
			
	int bill = 13;
	System.out.println("The total bill is " + (bill * 4) + " dollars.");
	
	int diapers = 8;
	System.out.println("You can buy " + (40/diapers) + " packs of diapers.");
	
	int clean = 29;
	System.out.println("Trevon received " + (41 - clean) + " dollars.");
	
	int run = 47;
	System.out.println("Pranav ran " + (run - 30 + " miles."));
	
	int boxes = 12;
	System.out.println("You can buy " + (boxes/3) + " boxes.");
	
	double salad = 5.12;
	System.out.println("Norachai had " + currency.format(salad + 27.10) + " dollars." );
	
	
	}

}
