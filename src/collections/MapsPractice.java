package collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

	public static void main(String[] args) {
		Map<String, BigDecimal> menu = new HashMap<String, BigDecimal>();
		menu.put("Spaghetti", new BigDecimal("8.97"));
		menu.put("Lasagna", new BigDecimal("10.98"));
		menu.put("Pizza", new BigDecimal("15.50"));
		menu.put("Caesar Salad", new BigDecimal("7.00"));
		menu.put("Kale Salad", new BigDecimal("7.00"));
		
		System.out.println("The price of spaghetti is: " + menu.get("Spaghetti"));
		System.out.println("There are " + menu.size() + " items on the menu.");
		
		menu.put("Champagne", new BigDecimal("200.00"));
		menu.put("Wine", new BigDecimal("175.00"));
		
		System.out.println("The menu contains champagne = " + menu.containsKey("Champagne"));
		System.out.println("The menu contains a $13.50 item = " + menu.containsValue("13.50"));
	
		System.out.println("We removed " + menu.remove("Kale Salad"));
		
		menu.clear();
		System.out.println(menu);
	}

}
