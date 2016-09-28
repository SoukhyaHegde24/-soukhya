package ac.in.kletech;

public class Patient {

	String name;
	String uid;
	int mobNum;
	
	Patient()
	{
		

	}
	Patient(String name,String uid,int mobNum)
	{
		this.name=name;
		this.uid=uid;
		this.mobNum=mobNum;
	}
	
	 static Patient search(Patient[] p,int keyMob)
	{
		 Patient temp=null;
		 for(int i=0;i<p.length;i++)
		 {
			 if(p[i].mobNum==keyMob)
			 {
				 temp=p[i];
				 break;
			 }
			 
		 }
		return temp;
	
		
		
	}
}
