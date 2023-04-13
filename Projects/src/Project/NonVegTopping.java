package Project;

import java.util.Scanner;
import java.util.Set;

public class NonVegTopping {

	Scanner sc = new Scanner(System.in);
	int bill;
	int totalBill;
	String ProductName;
	int Quantity;
	String type;
	long Price;
	double TotalPrice;
    boolean res=false;
	public void nonVegTopping(Set<Product> addProduct) {

		String[] non = { "Chicken tikka", "Barbeque chicken", "Grilled chicken" };
		for (int i = 0; i < non.length; i++) {
			System.out.println(i + 1 + ")" + non[i]);
		}
		System.out.println("select tapping type (1,2,3)");
		int s = sc.nextInt();
		if (s == 1) {
			ProductName = "Chicken tikka";
			bill = 35;
		} else if (s == 2) {
			ProductName = "Chicken tikka";
			bill = 35;
		}
		else if(s==3)
		{
			ProductName="Chicken tikka";
			bill=35;
		}
		else {
			ProductName=null;
			bill=0;
		}
		System.out.println(ProductName + "  How many qty need ?");
		totalBill = bill * 1;
		res=addProduct.add(new Product(ProductName, 1, "nonVeg", bill, totalBill));
		if (res)
			System.out.println(
					"Product added successfully.... product name : " + ProductName + "  size=" + addProduct.size());
	}
}
