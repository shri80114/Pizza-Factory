package Project;

import java.util.Scanner;

public class Product {

	private String ProductName;
	private int Quantity;
	private String type;
	private double Price;
	private double TotalPrice;
	private int tapping;
	private int sides;

	static Scanner sc = new Scanner(System.in);

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}

	public int getTapping() {
		return tapping;
	}

	public void setTapping(int tapping) {
		this.tapping = tapping;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public Product(String productName, int quantity, String type, double price, double totalPrice, int tapping) {
		super();
		ProductName = productName;
		Quantity = quantity;
		this.type = type;
		Price = price;
		TotalPrice = totalPrice;
		this.tapping = tapping;
	}

	public Product() {
		super();

	}

	public void displayFormat() {
		System.out.format(
				"---------------------------------------------------------------------------------------------------\n");
		System.out.print("|ProductName \t Quantity\t Type\t\t  Tapping  \t Price\t\t TotalPrice |\n");
		System.out.format(
				"---------------------------------------------------------------------------------------------------\n");

	}

	public void display() {

		System.out.println("|" + getProductName() + "\t  " + getQuantity() + "\t\t  " + getType() + "\t   "
				+ getTapping() + "\t\t "  + getPrice() + "\t\t   " + getTotalPrice() + "   |");
	}

}
