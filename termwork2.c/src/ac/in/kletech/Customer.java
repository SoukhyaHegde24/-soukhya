package ac.in.kletech;

import java.util.Scanner;

public class Customer extends HolidayBuddy{
	
	String sname;
	String saddress;
	long teleno;
	String gender;
	
	
	public Customer(String sname,String saddress,long teleno,String gender)
	{
		super();
		this.sname=sname;
		this.saddress=saddress;
		this.teleno=teleno;
		this.gender=gender;
		
	}
	
	void display()
	{
		System.out.println("Customer detils");
		System.out.println("Customer name:"+sname);
		System.out.println("Customer address:"+saddress);
		System.out.println("Customer teleno:"+teleno);
		System.out.println("Customer gender:"+gender);
	}
	
	
	Scanner sc=new Scanner(System.in);
	String t;
	void selectpackage()
	{
		System.out.println("Enter the choice of package:\n1 for Travel only\n2 for Holiday Package\n3 for Bed and Breakfast\n");
		choice =sc.nextInt();
		
		switch(choice)
		{
			case 1:packagename="Travel only package";
			System.out.println(packagename+" is booked");
			packageamt=10000d;
			System.out.println("Package Amount = Rs."+packageamt);
			count++;
			calDisc(packageamt);
			System.out.println("Total Amount=Rs."+checkGender(packageamt, gender));		
			break;
	case 2: packagename="Holiday Package";
			System.out.println(packagename+" is booked");
			packageamt = 20000d;
			System.out.println("Package Amount = Rs."+packageamt);
			count++;
			calDisc(packageamt);
			System.out.println("Total Amount=Rs."+checkGender(packageamt, gender));
			break;
	case 3: packagename="Bed and breakfast Package";
			System.out.println(packagename+" is booked");
			packageamt=5000d;
			System.out.println("Package Amount = Rs."+packageamt);
			count++;
			calDisc(packageamt);
			System.out.println("Total Amount = Rs."+checkGender(packageamt, gender));
			break;
	default: System.out.println("Wrong choice");
}
}	



void calDisc(double totalAmt){
double disc;

if(count>=2){
	disc=totalAmt*0.10;
	totalAmt=totalAmt-disc;
	System.out.println("Total Amount (the customer has visited more than one time)= Rs."+totalAmt);
}
else{
	disc=0;
	System.out.println("Total Amount (the customer has visited only once) = Rs."+ totalAmt);
}

}
double checkGender(double packageAmt, String gender){

if(this.gender=="Female"){
	discount=packageAmt*0.02;
	totamt = packageAmt-discount;
	System.out.println("Discount (based on gender)= Rs."+discount);
	return totamt;
}
else{
	discount=0;
	System.out.println("Discount(based on gender) = Rs."+discount);
	totamt=packageAmt-discount;
	return totamt;
}
}	

void status(){

System.out.println("Status:");
System.out.println("Package :"+ packagename);
System.out.println("Total Amount = Rs."+totamt);
 
}


}



