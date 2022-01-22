package JavaSessions;

public class Persons {
	
	String name;
	int age;
	long phone;
	
	//Constructor is having class name  to avoid object creation multiple times.
	//Below variables are local to constrcutor, scope with in that. Not like Class Variables.
	
	public Persons(String name,int age,long phonenumber) {
		this.name=name;
		this.age=age;
		this.phone=phonenumber;
	}
	
	public Persons(String name) {
		this.name=name;
		
		
	}
	public static void main(String[] args) {
		
		//Persons p1=new Persons();
		
//		p1.name="Imran";
//		p1.age=32;
//		p1.phonenumber=876765;
//		
//		System.out.println(p1.name + p1.age+ " "+p1.phonenumber);
		
		Persons p1=new Persons("Tom",45,987676);
		System.out.println(p1.name + " "+ p1.age +" "+" "+p1.phone);
		
		Persons p2=new Persons("Kan",48,999676);
		System.out.println(p2.name + " "+ p2.age +" "+" "+p2.phone);
		
		Persons p3=new Persons("Kan");
		System.out.println(p3.name + " "+ p3.age +" "+" "+p3.phone);
		
		
		
	}

}
