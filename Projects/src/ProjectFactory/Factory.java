package ProjectFactory;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import Project.Product;

public class Factory {

	int bill;
	double totalBill;
	double FinalBill;
	Scanner sc = new Scanner(System.in);

	String ProductName;
	String Type;
	Integer Quantity;
	Integer Size;
	Double Price;
	Double TotalPrice;
	Set<Product> addProduct = new LinkedHashSet<>();
	LinkedHashMap<Integer, String> vegPizza;
	LinkedHashMap<Integer, String> product;
	LinkedHashMap<Integer, String> nonVegPizza;

	public void menu() {

		LinkedHashMap<Integer, String> product = new LinkedHashMap<>();
		product.put(1, " Vegetarian Pizza ");
		product.put(2, " Type of crust ");
		product.put(3, " Extra toppings ");
		product.put(4, " Sides ");
		product.forEach((x, y) -> System.out.println(x + ") " + y));
		System.out.println();
		System.out.println("NOTE -: No Order cancellation option");
		display();
	}

	public void display() {

		System.out.println("Select Your Option (valid values are 1,2,3 \n");
		int option = sc.nextInt();

	}

	public static void main(String[] args) {

		new Factory().menu();

	}

}
