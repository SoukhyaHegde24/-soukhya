package ac.in.kletech;

public class demo {

	public static void main(String[] args) {
		Customer c = new Customer("Sou", "hubli", 9887986758l, "Female");
		c.display();
		c.selectpackage();
		c.status();
		
		System.out.println("\n");
		Customer c2 = new Customer("Smi", "Bangalore", 8887986758l, "Female");
		c2.display();
		c2.selectpackage();
		c2.status();


	}

}
