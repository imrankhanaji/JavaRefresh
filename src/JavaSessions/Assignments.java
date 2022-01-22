package JavaSessions;

public class Assignments {

	public static void main(String[] args) {
		
		//Hello Naveen on separate line
		String str="Hello";
		String str1="Naveen K";
		System.out.println(str);
		System.out.println(str1);
	
		//sum of two numbers
		
		int i=74;
		int j=36;
		System.out.println(i+j);
		
		//Divide two numbers
		
		int p=50;
		int p1=3;
		System.out.println(p/p1);
		
		// first scenarios
		
		int f1=-5;
		int f2=8;
		System.out.println(f1+(f2*6));
		
		// second scenario
		int f3=55;
		int f4=9;
		System.out.println((f3+f4)%9);
		
		// third scenario
				int f5=20;
				int f6=-3;
				int f7=5;
				System.out.println(f5+f6*f7/8);
				
		//Fourth scenario 
					
				int f8=5;
				int f9=15;
				//int f10=3;
				System.out.println(f8+f9/3*2-8/3);
		//Fifth scenario
			
				System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		//Concatenation
	
		String s="Hello Selenium";
		String s1="t";
		System.out.println(s+ " " +s1);
		
		//sum and concatenate
		String ff="Your Total amount is";
		int x=100;
		int y=200;
		int z=3400;
		System.out.println(ff+ " " +(x+y+z));
		
		//Final scenario, due to the zero before 65 value printing as 53
		
		byte b3 = 65;

		System.out.println(b3);
		
		//if else
		
		int rr=70;
		int tt=60;
		
		if (rr>tt) 
			System.out.println("pass");
		//elseif
			//System.out.println("fail");
		else
		
			System.out.println("fail");
			
}

}
