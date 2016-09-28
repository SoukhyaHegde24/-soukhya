package ac.in.kletech;

public class Worker {
	String name;
	double salary;
	
	int incrementAmt=1000;
	
	Worker()
	{
	}
	Worker(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	
	static  void increment(Worker w)
	{
		w.salary=w.salary+w.incrementAmt;
	}
	
	static void increment(Worker[] w,int increAmt)
	{
		for(int i=0;i<w.length;i++)
		{	
			w[i].salary=w[i].salary+increAmt;
		}
	}
	
	static void increment(Worker w,int increAmt)
	{
		w.salary=w.salary+increAmt;
	}
	
	static void increment(Worker[] w,int[] increAmt)
	{
		for(int i=0;i<w.length;i++)
		{
			
			w[i].salary=w[i].salary+increAmt[i];
		}
	}
	

}
