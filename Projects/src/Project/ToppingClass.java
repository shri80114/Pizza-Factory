package Project;

import java.util.Scanner;

public class ToppingClass {

	 Scanner sc = new Scanner(System.in);

	public int nonVegTopping() {
		System.out.println("1)Chicken tikka\n2)Barbeque chicken\n3)Grilled chicken");
		System.out.println("select tapping type (1,2,3)");
		int s = sc.nextInt();
		if (s == 1)
			return 35;
		else if (s == 2)
			return 45;
		else if (s == 3)
			return 40;
		return 0;
	}

	public int vegTopping() {
		System.out.println("Select Veg toppings ");

		System.out.println("1)Black olive\n2)Capsicum\n3)Paneer\n4)Mushroom\n5)Fresh tomato");
		System.out.println("select topping type (1,2,3,4,5)");
		int s = sc.nextInt();
		if (s == 1)
			return 20;
		else if (s == 2)
			return 25;
		else if (s == 3)
			return 35;
		else if (s == 4)
			return 30;
		else if (s == 5)
			return 10;
		return 0;
	}

	int sides() {
		System.out.println("1)Cold drink \n2)Mousse cake");
		int type = sc.nextInt();

		if (type == 1) {
			System.out.println("1)sprite\n2)Pepsi\n3)Fanta");
			int s = sc.nextInt();
			if (s == 1)
				return 20;
			else if (s == 2)
				return 25;
			else if (s == 3)
				return 20;
		} else if (type == 2) {
			System.out.println("1)Chocolate Chip\n 2)Vanilla \n3)Butter");
			int s = sc.nextInt();
			if (s == 1)
				return 50;
			else if (s == 2)
				return 35;
			else if (s == 3)
				return 80;
		}
		return 0;
	}

}
