package ac.in.kletech;

public abstract class HolidayBuddy {

		static int count;
		String packagename;
		double packageamt;
		int choice;
		String gender;
		double discount;
		double totamt;
		
		
		abstract void selectpackage();
		abstract void caldisc(double totamt);
		abstract double checkgender(double packageamt,String gender);
		abstract void checkstatus();
		
		
}




