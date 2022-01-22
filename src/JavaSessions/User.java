package JavaSessions;

public class User {
	
	// data members:
	//1. Class Variables
	//2. Class Methods
	
	String name;
	int age;
	String email;
	long phone;
	String address;
	boolean iscitizen;
	
	public void getName() {
		
		System.out.println("get name method");
	}
	
	public static void main(String ar[]) {
		
		//for using class data members, we need to create the object of the class
		//using new keyword
		
		User user1=new User();
		
		user1.name="Imran";
		user1.age=33;
		user1.email="imran@gmail.com";
		user1.iscitizen=true;
		user1.address="3/129A Pillayar street";
		user1.phone=8787656;
		
		//calling get name method
		
		user1.getName();
		
		User user2=new User();
		
		user2.name="Suresh";
		user2.age=34;
		user2.email="Suresh@gmail.com";
		user2.iscitizen=false;
		user2.address="3/129A Koil street";
		user2.phone=87676565;
		
		user2.getName();
		
		User user3=new User();
		
		user3.name="Ansari";
		user3.age=35;
		user3.email="ans@gmail.com";
		
		user3.getName();
		
		System.out.println(user1.name + " " +user1.age+ " " + user1.email +" "+user1.iscitizen+ " "+ user1.address+" "+user1.phone);
		System.out.println(user2.name + " " +user2.age+ " " + user2.email +" "+user2.iscitizen+ " "+ user2.address+" "+user2.phone);
		System.out.println(user3.name + " " +user3.age+ " " + user3.email +" "+user3.iscitizen+ " "+ user3.address+" "+user3.phone);
	}
	
	
	

}
