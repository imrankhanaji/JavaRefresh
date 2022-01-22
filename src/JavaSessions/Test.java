package JavaSessions;

public class Test {

	public static void main(String[] args) {
		
		//voting eligible criteria check switch case
				int age=18;
				switch (age) {
				case 0:
					System.out.println("Voting not allowed for minor candidates");
					break;
					
				case 1:
					System.out.println("Voting not allowed for minor candidates");
					break;
				case 2:
					System.out.println("Voting not allowed for minor candidates");
					break;
				case 18:
					System.out.println("Voting allowed for major candidates");
					break;
				default:
					System.out.println("Voting not allowed for less than 18 Age");
					break;
				
			
				}
				
				//voting eligible criteria check
				
				
				//int agej=1;
				int ex=19;
				
				if(ex>=18)
					System.out.println("voting allowed");
				else if (ex<=18) 
					System.out.println("voting not allowed for this candidate also");
				else
					System.out.println("Null value");
				
				  int x = 10;  
				  int y = 20;  
				  System.out.println("value of x:" + x);  
				  System.out.println("value of y:" + y);  
				  x = x + y;  
				  y = x - y;  
				  x = x - y;  
				  System.out.println("value of x:" + x);  
				  System.out.println("value of y:" + y);
				  
//				  //while loop
//				  while(true) {
//					  System.out.println("welcome to java world");
////				  }
					  
				  int i=1;
				  while (i<=5) {
					  //System.out.println("*****");
					  System.out.println("I am a bat man");
					  i++;
				  }
				  
				  int j=1;
				  while (j<=9) {
					  //System.out.println("*****");
					  System.out.println("I am a bat man" +" " +j);
					  //System.out.println(ff+ " " +(x+y+z));
					  j++;
				  }
				 
//				  for (; ;) {
//					  System.out.println("Hello");
//				  }
				  //int t=1;
				  for (int t=1;t<=10;t++) {
				  
				  	System.out.println(t);
				  	
				  }
				  for (int t=10;t>=1;t--) {
					  
					  	System.out.println(t);
					  	
					  }
				  
				  int k=10;
				  while (k>=1) {
					  //System.out.println("*****");
					  System.out.println(k);
					  k--;
				  }
				  
				  System.out.println("-------"); 
				  int count=10;
				  
				  do {
					  System.out.println(count); 
					  count--;
				  }
				  while(count>0);
				  
				  
				}
						  

	}

