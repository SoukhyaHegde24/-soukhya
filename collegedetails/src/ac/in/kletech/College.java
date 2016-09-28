package ac.in.kletech;

public class College {

		String name;
		Department[] departments=new Department[10];
		int depi=0;
		String colCode;
		
		
		College()
		{
		}
		public College(String name,String colCode)
		{
			this.name=name;
			this.colCode=colCode;
		}

		void addDepartment(String name,String depCode,int numofStu)
		{	
			departments[depi++]=new Department(name,depCode,numofStu);
			
		}
	
		int getCollegeStrength()
		{
			int tot=0;
			for(int i=0;i<departments.length;i++)
				if(departments[i] !=null)
					tot=tot+departments[i].numofStu;
			
			return tot;
		}



	class Department
	{
		String name;
		String depcode;
		int numofStu;
		
		
		public Department(String name,String depcode,int numofStu)
		{
			this.name=name;
			this.depcode=depcode;
			this.numofStu=numofStu;
		}
	}

}














