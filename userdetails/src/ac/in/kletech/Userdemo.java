package ac.in.kletech;

public class Userdemo {

	public static void main(String[] args) {
		User u1=new User("aaa","admin");
		System.out.println(u1);
		
		User u2=new User("bbb","Noraml");
		System.out.println(u2);
		
		User u=new User();
		User[] users=u.createUsers();
		System.out.println("User before sort");
		
		u.printUsers(users);
		u.sortUsers(users);
		System.out.println("User after sort");
		u.printUsers(users);


	}

}
