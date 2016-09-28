package ac.in.kletech;

import java.util.Scanner;

abstract public class Customer {
	 
	 int custid;
	 String custName;
	 int phonenum;
	 double billamt;
	 
	 Customer()
	 {
		 
	 }
	 
	 Customer( int custid, String custName,int phonenum,double billamt)
	 {
		 this.custid=custid;
		 this.custName=custName;
		 this.phonenum=phonenum;
		 this.billamt=billamt;
	 }
	 
	 public String toString()
		{
			return custid+":"+custName+":"+phonenum+":"+billamt;
		}
		abstract double computeBill();
		{
			
		}
	 
	 
	 void printCustInfo(Customer c)
		{
			System.out.println(c);
		}
}
	class RegCustomer extends Customer
	{
		double discount;
		String t;
		static int rc;
		Scanner sc=new Scanner(System.in);
		RegCustomer(){}
		RegCustomer(int custId,String custName,int phoneNum,double billAmt,double discount)
		{
			super(custId,custName,phoneNum,billAmt);
			this.discount=discount;
			rc++;
		}
		void printCustInfo(RegCustomer r)
		{
			System.out.println(r);
			System.out.println(r.discount);
		}
		double computeBill()
		{
			System.out.println("Is it the first time");
			t=sc.next();
			if(t.equals("Y"))
				return (billamt-(billamt*discount));
			else
				return (billamt-(billamt*(discount+0.05)));
		}
		int noOfRegCust()
		{
			return rc;
		}
	}
	class PriCustomer extends Customer
	{
		String memCardType;
		static int pi;
		PriCustomer(){}
		PriCustomer(int custId,String custName,int phoneNum,double billAmt,String memCardType)
		{
			super(custId,custName,phoneNum,billAmt);
			this.memCardType=memCardType;
		}
		void printCustInfo(PriCustomer p)
		{
			System.out.println(p);
			System.out.println(p.memCardType);
		}
		double computeBill()
		{
			if(memCardType.equals("A"))
					return (billamt-(billamt*0.2));
			else
					return (billamt-(billamt*0.1));
		}

		int noOfPriCust()
		{
			return pi;
		}
}
	 
	 
	 


