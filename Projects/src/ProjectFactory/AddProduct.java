package ProjectFactory;

import java.util.LinkedHashMap;

public class AddProduct {

	LinkedHashMap<Integer, String> vegPizza;
	LinkedHashMap<Integer, String> product;
	LinkedHashMap<Integer, String> nonVegPizza;
	LinkedHashMap<Integer, String> TypeOfCrust;
	LinkedHashMap<String, Integer> VegToppings;
	LinkedHashMap<String, Integer> NonVegToppings;
	LinkedHashMap<String,Integer> Sides;

	void methd() {
		// Veg Pizz
		vegPizza = new LinkedHashMap<Integer, String>();
		vegPizza.put(1, " Deluxe Veggie ");
		vegPizza.put(2, " Cheese and corn ");
		vegPizza.put(3, " Paneer Tikka ");

		// Non-veg Pizza
		nonVegPizza = new LinkedHashMap<Integer, String>();
		nonVegPizza.put(1, " Non-Veg Supreme ");
		nonVegPizza.put(2, "  Chicken Tikka ");
		nonVegPizza.put(3, " Pepper Barbecue Chicken");

		// Type of crust
		TypeOfCrust = new LinkedHashMap<Integer, String>();
		TypeOfCrust.put(1, "New hand tossed");
		TypeOfCrust.put(1, " Wheat thin crust");
		TypeOfCrust.put(1, "Cheese Burst");
		TypeOfCrust.put(1, " Fresh pan pizza");

		// NonVegToppings
		NonVegToppings = new LinkedHashMap<>();
		NonVegToppings.put(" Chicken tikka", 20);
		NonVegToppings.put("Barbeque chicken", 20);
		NonVegToppings.put(" Grilled chicken", 20);

		// VegToppings
		VegToppings = new LinkedHashMap<>();
		VegToppings.put("Black olive", 20);
		VegToppings.put("Capsicum", 25);
		VegToppings.put("Paneer", 35);
		VegToppings.put("Mushroom", 20);
		VegToppings.put("Fresh tomato", 20);
		
		//Sides
		Sides = new LinkedHashMap<>();
		Sides.put("Cold drink",55);
		Sides.put("Mousse cake",90);
		
		
		

	}

}
