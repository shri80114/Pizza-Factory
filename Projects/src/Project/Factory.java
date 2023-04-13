package Project;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Factory {
	int bill;
	int totalBill;
	static double FinalBill;

	String ProductName;
	int Quantity;
	String type;
	long Price;
	double TotalPrice;
	int tapping;

	int pizz;
	static Set<Product> addProduct = new LinkedHashSet<>();
	Scanner sc = new Scanner(System.in);

	public void Menu() {
		System.out.println(
				"<------------------------> Menu Card <-------------------------> \n \t\t1) Vegetarian Pizza \n \t\t2) Non-Vegetarian \n \t\t3) Sides ");

		System.out.println("NOTE -: No Order cancellation option");
		System.out.println("Select Your Option (valid values are 1,2,3 \n");
		new Factory().display();
	}

	public void display() {
		LinkedList<String> vegPizza = new LinkedList<>();
		vegPizza.add("Deluxe Veggie");
		vegPizza.add("Cheese and corn");
		vegPizza.add("Paneer Tikka");

		ArrayList<String> nonVegPizza = new ArrayList<>();
		nonVegPizza.add("Non-Veg Supreme");
		nonVegPizza.add("Chicken Tikka");
		nonVegPizza.add("Pepper Barbecue Chicken");

		int option = sc.nextInt();
		boolean res = false;
		switch (option) {
		case 1:
			System.out.println("Which veg-option do you want?");
			// vegPizza.forEach((x) -> System.out.println(x));
			for (int i = 0; i < vegPizza.size(); i++) {
				System.out.println(i + 1 + ")" + vegPizza.get(i));
			}
			System.out.println("select pizz (1,2,3)");

//			while(true)
//			{
			pizz = sc.nextInt();
			type = "";
			if (pizz == 1) {
				ProductName = "Deluxe Veggie";
				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 150;
					break;
				case 2:
					type = "Medium";
					bill = 200;
					break;
				case 3:
					type = "Large";
					bill = 325;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					// Menu();
				}
//				if (!type.isEmpty())
//					break;
//			}	
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
//				if(res)
//				System.out.println(
//						"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
				System.out.println("Do you want add extra topping? Please press 1 else press 2");
				int Topping = sc.nextInt();
				if (Topping == 1) {
					new ToppingClass().vegTopping(addProduct);
				}

				System.out.println("if want to continue with shopping press 1 else Press 2");
				new BillingClass().billing(FinalBill, addProduct);

			} else if (pizz == 2) {
				ProductName = "Cheese & corn";
				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 175;
					break;
				case 2:
					type = "Medium";
					bill = 375;
					break;
				case 3:
					type = "Large";
					bill = 475;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					Menu();
				}
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
				if (res)
					System.out.println("Product added successfully.... product name : " + ProductName + "  size="
							+ addProduct.size());
				System.out.println("Do you want add extra topping? Please press 1 else press 2");
				int Topping = sc.nextInt();
				if (Topping == 1) {
					new ToppingClass().vegTopping(addProduct);
				}
//				
//				if (res)
//					System.out.println("Product added successfully.... product name : " + ProductName + "  size="
//							+ addProduct.size());
				System.out.println("if want to continue with shopping press 1 else Press 2");
				new BillingClass().billing(FinalBill, addProduct);

			} else if (pizz == 3) {
				ProductName = "Paneer Tikka";
				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 160;
					break;
				case 2:
					type = "Medium";
					bill = 290;
					break;
				case 3:
					type = "Large";
					bill = 340;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					new Factory().Menu();
				}
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
				if (res)
					System.out.println("Product added successfully.... product name : " + ProductName + "  size="
							+ addProduct.size());
				System.out.println("Do you want add extra topping? Please press 1 else press 2");
				int Topping = sc.nextInt();
				if (Topping == 1) {
					new ToppingClass().vegTopping(addProduct);
				}
//				if (res)
//					System.out.println("Product added successfully.... product name : " + ProductName + "  size="
//							+ addProduct.size());
				System.out.println("if want to continue with shopping press 1 else Press 2");
				new BillingClass().billing(FinalBill, addProduct);

			} else {
				System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
				new Factory().Menu();
			}

			break;
		case 2: {
			for (int i = 0; i < nonVegPizza.size(); i++) {
				System.out.println(i + ")" + nonVegPizza.get(i));
			}
			System.out.println("select pizz (0,1,2)");

			pizz = sc.nextInt();
			if (pizz == 0) {
				ProductName = "Supreme  ";

				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 190;
					break;
				case 2:
					type = "Medium";
					bill = 325;
					break;
				case 3:
					type = "Large";
					bill = 425;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					new Factory().Menu();
				}
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
//				if(res)
//					System.out.println(
//							"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
				System.out.println("If want add extra topping to your pizza Press 1 OtherWise press 2");
				int ss = sc.nextInt();
				if (ss == 1) {
					// nonVegTopping();
					new NonVegTopping().nonVegTopping(addProduct);
				}
				System.out.println(" if want to continue with shopping press 1 Otherwise Press 2");
				new BillingClass().billing(FinalBill, addProduct);
			} else if (pizz == 1) {
				ProductName = "Chicken Tikka";

				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 210;
					break;
				case 2:
					type = "Medium";
					bill = 370;
					break;
				case 3:
					type = "Large";
					bill = 500;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					new Factory().Menu();
				}
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
//				if(res)
//					System.out.println(
//							"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
				System.out.println("If want add extra topping to your pizza Press 1 OtherWise press 2");
				int ss = sc.nextInt();
				if (ss == 1) {
					new NonVegTopping().nonVegTopping(addProduct);
				}
				// res = addProduct.add(new Product(ProductName, Quantity, type, bill,
				// totalBill));

				System.out.println(" if want to continue with shopping press 1 Otherwise Press 2");
				new BillingClass().billing(FinalBill, addProduct);
			} else if (pizz == 2) {
				ProductName = "Pepper Barbecue";

				System.out.println("1)Regular \n2)Medium \n3)Large");
				System.out.println("select pizz Type (1,2,3)");
				int PizzSize = sc.nextInt();
				switch (PizzSize) {
				case 1:
					type = "Regular";
					bill = 220;
					break;
				case 2:
					type = "Medium";
					bill = 380;
					break;
				case 3:
					type = "Large";
					bill = 525;
					break;
				default:
					System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
					new Factory().Menu();
				}
				System.out.println(type + " piza How many qty need ?");
				int Quantity = sc.nextInt();
				totalBill = Quantity * bill + tapping;
				FinalBill = totalBill + FinalBill;
				res = addProduct.add(new Product(ProductName, Quantity, type, bill, totalBill));
//				if(res)
//					System.out.println(
//							"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
				System.out.println("If want add extra topping to your pizza Press 1 OtherWise press 2");
				int Topping = sc.nextInt();
				if (Topping == 1) {
					new NonVegTopping().nonVegTopping(addProduct);
				}
				System.out.println(" if want to continue with shopping press 1 Otherwise Press 2");
				new BillingClass().billing(FinalBill, addProduct);
			} else {
				System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");

				new Factory().Menu();
			}
		}
			break;
		case 3:
			ArrayList<String> sides = new ArrayList<>();
			sides.add("Mousse cake");
			sides.add("Cold drink");
			for (int i = 0; i < sides.size(); i++) {
				System.out.println(i + 1 + ")" + sides.get(i));
			}
			System.out.println("select pizz (0,1,2)");
			pizz = sc.nextInt();
			if (pizz == 1) {
				ProductName = "Mousse cake";
				bill = 55;
			} else if (pizz == 2) {
				ProductName = "Mousse cake";
				bill = 90;
			}
			res = addProduct.add(new Product(ProductName, 1, "sides", bill, totalBill));
//			if (res)
//				System.out.println(
//						"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
			new BillingClass().billing(FinalBill, addProduct);
			break;
		default:
			System.out.println("Invalid Pizza type entered, going to back to main menu, Enter Correct type");
			new Factory().Menu();

		}

	}

	public static void main(String[] args) {

		new Factory().Menu();
	}

}
