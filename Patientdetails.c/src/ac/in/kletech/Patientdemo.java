package ac.in.kletech;

public class Patientdemo {

	public static void main(String[] args) {
		
		Patient[] p=new Patient[5];
		p[0]=new Patient("patient1","uid1",6444);
		
		p[1]=new Patient("patient2","uid2",6445);
		p[2]=new Patient("patient1","uid3",6446);
		p[3]=new Patient("patient1","uid4",6447);
		p[4]=new Patient("patient1","uid5",6448);
		
		int keyMob=6446;
		
		Patient pp=Patient.search(p, keyMob);
		
		if(pp==null)
			System.out.println("no patient found");
		else
		{
			System.out.println("patient found with following details");
			System.out.println("name="+pp.name);
			System.out.println("uid="+pp.uid);
			System.out.println("name="+pp.mobNum);
			
		}
		



	}

}
