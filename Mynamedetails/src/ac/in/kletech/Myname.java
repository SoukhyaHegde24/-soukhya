package ac.in.kletech;

public class Myname {
	private String privateName;
	public String publicName;
	String defaultName;
	
	//Constructors
	
	Myname(String name)
	{
		privateName=publicName=defaultName=name;
	}
	
	Myname(String privateName, String publicName,String defaultName)
	{
		this.privateName=privateName;
		this.publicName=publicName;
		this.defaultName=defaultName;
	

	}
	
	public String getName()
	{
		return privateName;
	}
	

}
