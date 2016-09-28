package ac.in.kletech;

public class Workerdemo{
	
	public static void main(String[] args){
	Worker[] w=new Worker[5];
	for(int i=0;i<w.length;i++)
	{
		w[i]=new Worker("worker"+i,14000+ i*10);
	}
	
	//increments
	for(int i=0;i<w.length;i++)
	{
		Worker.increment(w,100);
		
	}
	//print all worker details
	
	int[] incrAmt={50,100,150,50,100};
	for(int i=0;i<w.length;i++)
	{
		Worker.increment(w,incrAmt);
	}
	//print all worker details
	Worker.increment(w[3]);
	Worker.increment(w[4],100);
	//print w[3],w[4]
	
	}
}
