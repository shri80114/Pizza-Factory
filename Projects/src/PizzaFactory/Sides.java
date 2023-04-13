package PizzaFactory;

import java.util.LinkedHashMap;

public class Sides {
	
	private LinkedHashMap<String,Integer> sides;
	
	public void SidesMethod()
	{
		sides = new LinkedHashMap<String,Integer>();
		sides.put("Cold drink", 55);
		sides.put("Mousse cake", 90);
	}
	

}
