package ac.in.kletech;

public class User {

	private int id;
	String name;
	String type;
	static int stuid=0;
	User()
	{
	}
	User(String name)
	{
		this.name=name;
		
		stuid++;
		id=stuid;
		
		
	

	}
	
	User(String name,String type)
	{
		this.name=name;
		this.type=type;
		stuid++;
		id=stuid;
	}

	
	int getid()
	{
		return id;
	}
	
	public String toString()
	{
		return(id+":"+name+":"+type);
	}
	
	static User[] createUsers()
	{
		User[] u=new User[5];
		u[0]=new User("aaa","admin");
		u[0].id=0;
		u[1]=new User("bbb","Normal");
		u[1].id=1;
		u[2]=new User("ccc","Normal");
		u[2].id=2;
		u[3]=new User("ddd","Normal");
		u[3].id=3;
		u[4]=new User("eee","Noraml");
		u[4].id=4;
		
		return u;		
		
	}
	void printUsers(User[] u)
	{
		for(int i=0;i<u.length;i++)
		{
			System.out.println(u[i]);
		}
	}
	
	void sortUsers(User[] u)
	{
		User temp=new User();
		temp=null;
		for(int j=0;j<u.length;j++)
		{
			for(int k=1;k<=(u.length-1);k++)
			{
				if(u[k-1].id<u[k].id)
				{
					temp=u[k-1];
					u[k-1]=u[k];
					u[k]=temp;
				}
			}
				
			
		}
	}
}




	