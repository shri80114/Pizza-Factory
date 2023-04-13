package PizzaFactory;

import java.util.LinkedHashMap;

public class ExtraToppings {

	private LinkedHashMap<String,Integer> vegExtraToppings;
	private LinkedHashMap<String,Integer> novVegExtraToppings;

	

	public void vegTopping() {
		
		vegExtraToppings = new LinkedHashMap<>();
		vegExtraToppings.put("Black olive", 20);
		vegExtraToppings.put("Capsicum", 25);
		vegExtraToppings.put("Paneer", 30);
		vegExtraToppings.put("Mushroom", 35);
		vegExtraToppings.put("Fresh tomato", 10);
	}
	
	public void nonVegTopping()
	{
		novVegExtraToppings=new LinkedHashMap<>();
		novVegExtraToppings.put("Chicken tikka", 35);
		novVegExtraToppings.put("Barbeque chicken", 45);
		novVegExtraToppings.put("Grilled chicken", 45);
	}

}
