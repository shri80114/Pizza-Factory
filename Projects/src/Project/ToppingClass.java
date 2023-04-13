package Project;

import java.util.Scanner;
import java.util.Set;

public class ToppingClass {

	Scanner sc = new Scanner(System.in);
	int bill;
	int totalBill;

	String ProductName;
	int Quantity;
	String type;
	long Price;
	double TotalPrice;
	int tapping;

	public void vegTopping(Set<Product> addProduct) {
		System.out.println("Select Veg toppings ");
		boolean res = false;
//		System.out.println("1)Black olive\n2)Capsicum\n3)Paneer\n4)Mushroom\n5)Fresh tomato");
		String[] veg = { "Black olive", "Capsicum", "Paneer", "Mushroom", "Fresh tomato" };
		for(int i=0;i<veg.length;i++)
		{
			System.out.println(i+1+")"+veg[i]);
		}
		System.out.println("select topping type (1,2,3,4,5)");
		int s = sc.nextInt();
		if (s == 1) {
			ProductName = "Black olive";
			bill = 20;
		} else if (s == 2) {
			ProductName = "Capsicum";
			bill = 25;
		} else if (s == 3) {
			ProductName = "Paneer";
			bill = 35;
		} else if (s == 4) {
			ProductName = "Mushroom";
			bill = 30;
		} else {
			ProductName = null;
			bill = 0;
		}
		// System.out.println(ProductName + " How many qty need ?");
		totalBill = bill * 1;
		res = addProduct.add(new Product(ProductName, 1, "Veg", bill, totalBill));
		if (res)
			System.out.println(
					"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
	}

}
