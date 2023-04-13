package PizzaFactory;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainFactory {
	
	Scanner sc=new Scanner(System.in);
	Pizza p=new Pizza();
	
	public void Menu()
	{
		String[] menu= {"Vegetarian Pizza","Sides"};
		
		for(int i=0;i<menu.length;i++)
		{
			System.out.println(i+1+")"+menu[i]);
		}
		System.out.println("\nNOTE -: No Order cancellation option\n\n");
		System.out.println("Select Your Option (valid values are 1,2,3) \n");
		display();
	}
	
	
	public void display() {
		
		int option = sc.nextInt();
		switch(option)
		{
		case 1: System.out.println("1)Vegetarian Pizza\n2)Non-Vegetarian");
				System.out.println("Select Your Option (valid values are 1,2) \n");
				int option1=sc.nextInt();
				LinkedHashMap<Integer,String> crust=new TypeOfCrustList().TypeCrust();
				if(option1==1)
				{
					LinkedHashMap<Integer,String> veg=new VegetarianPizza().vegPizzaList();

					veg.forEach((x,y)-> System.out.println(x+")"+""+y));
					int type=sc.nextInt();
					
					System.out.println("Which veg-option do you want?");
					//crust.forEach((x,y)->System.out.println(x+")"+""+y));
					if(type==1)
					{
						p.setProductName(veg.get(1));
						System.out.println("select pizz Type (1,2,3)");
						int size=sc.nextInt();
						
					}
					
				}
				else if(option1==2)
				{
					LinkedHashMap<Integer,String> veg=new VegetarianPizza().nonVegPizzaList();

					veg.forEach((x,y)-> System.out.println(x+")"+""+y));
					crust.forEach((x,y)->System.out.println(x+")"+""+y));
				}
				
				break;
		case 2:
		}
		
	}


	public static void main(String[] args) {
		
		System.out.println("=============> WELCOME TO PIZZA FACTORY <=============");
		System.out.println();
		new MainFactory().Menu();
		
		
		
	}

}
