package ac.in.kletech;

public class IntOperationDemo {

	public static void main(String[] args) {
		IntOperations n=new myNum(902);
		if(n.isEven())
			System.out.println("no is even");
		if(n.isOdd())
			System.out.println("no is odd");
		if(n.isPositive())
			System.out.println("no is positive");
		if(n.isNegative())
			System.out.println("no is negative");
		System.out.println("Sum of digits="+n.getSumofDigits());


		


	}

}
