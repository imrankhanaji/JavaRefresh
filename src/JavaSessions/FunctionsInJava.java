package JavaSessions;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		String n1=obj.getTrainerName();
		System.out.println(n1);
		System.out.println(obj.getTrainerName());
		System.out.println(obj.getTotal());
		int s1=obj.add(10, 20);
		System.out.println(s1+40);
		
		
	}
	
	//Simple Method: does not return anything doesnot take any parameter--> Void type
			//no input and no output-> no return keyword
			//System.out.println(test); we have to create object to use test method
			
	
	public void test() {
		
		System.out.println("test- method");
	}
	
	//2. no input but some return
	// return type String
	
	public String getTrainerName() {
		
		System.out.println("getTrainerName");
		
		String name="Naveen";
		return name;
		
		
	}
	
	public int getTotal() {
		
		System.out.println("getTotal");
		
		int a=100;
		int b=200;
		int count=a+b;
		return count;
		
		
	}
	
	// some input and some return
	
	public int add(int x, int y) {
		
		System.out.println("add-method");
		
		int z=x+y;
		
		return z;
		
		
	}
	
	
}
