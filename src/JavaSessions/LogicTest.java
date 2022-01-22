package JavaSessions;

public class LogicTest {

	public static void main(String[] args) {
		
		int x=100;
		int y=500;
		int z=300;
		
		if(x>y && x>z) {
			System.out.println("x is the highest");
			
		}
		else if(y>z) {
			System.out.println("y is the highest");
			
		}
		else {
			System.out.println("z is the highest");
		}
		
		//************************************************
		String browser="safari";
		
		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;	

		default:
			System.out.println("pass correct browser name");
			break;
		}
		
		int i=10;
		while (i>=0) {
			System.out.println(i);
			i=i-1;
		}
		
		
		//print odd
		for(int k=1;k<=10;k=k+2) {
			System.out.println(k);
		}
		
		//print even
				for(int t=0;t<=10;t=t+2) {
					System.out.println(t);
				}
				
				int q=1;
				do {
					System.out.println(q);
					q--;
				} 
				while (q>2);

	}
	
	//print a pattern
	
	
	
	

}
