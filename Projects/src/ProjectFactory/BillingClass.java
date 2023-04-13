package ProjectFactory;

import java.util.Scanner;
import java.util.Set;

import Project.Factory;
import Project.Product;

public class BillingClass {
	
	Scanner sc = new Scanner(System.in);

	void billing(double FinalBill, Set<Product> addProduct) {
		int choose = sc.nextInt();

		if (choose == 1) {
			new Factory().Menu();

		} else

		{
			System.out.println("<----------------------> Welcome Pizza Factory <---------------------->");
			new Product().displayFormat();
			for (Product s : addProduct) {
				s.display();
				System.out.println("---------------------------------------------------------------------------------------------------");

			}
				System.out.println(" Your Total Bill is : " + FinalBill);
			System.out.println("--------------------- VISIT AGAIN ---------------------");
		}
sc.close();
	}

}
