package JavaSessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		int x=25;
		int y=78;
		int z=87;
		int p=101;
		
		if(x>y && y>z)
			System.out.println("x is the Greatest number");
		else if (y>z)
			System.out.println("y is the Greatest number");
		else if (z>p)
			System.out.println("z is the Greatest number");
		else
			System.out.println("p is the Greatest number" + " "+p);
		
		//voting eligible criteria check using if else
		int ex=17;
		
		if(ex>=18)
			System.out.println("voting allowed");
		else if (ex<=18) 
			System.out.println("voting not allowed for this candidate");
		else
			System.out.println("Null value");
		
		//living criteria (Leap year would be 366 Days which divisible by 4)
		int days=1100;
		if(days>=1100)
			System.out.println("voting allowed");
		else if (days<=1100) 
			System.out.println("voting not allowed for this candidate also");
		else
			System.out.println("Null value");
		
		
				  
				  	//Student name belongs to score
				  	int v=100;
					int v1=90;
					int v2=200;
					
					if (v==90)
					System.out.println("Player name is virat");
					else if (v1==80)
						System.out.println("Player name is smith");
					else if (v2==100)
						System.out.println("Player name is sachin");
					else
						System.out.println("Warner is not found");
					
			//Switch case
				
				int swtch=300;
				switch (swtch) {
				case 100:
					System.out.println("Player name is virat");
					break;
					
				case 90:
					System.out.println("Player name is smith");
					break;
					
				case 201:
					System.out.println("Player name is sachin");
					break;
				
				default:
					System.out.println("Warner is not found");
					break;
				}
				//Java Program to Swap Two Numbers with and without 3rd variable
				
			 	int x1 = 10;  
			 	int y1 = 20;  
				  System.out.println("value of x1:" + x1);  
				  System.out.println("value of y1:" + y1);  
				  x1 = x1 + y1;  
				  y1 = x1 - y1;  
				  x1 = x1 - y1;  
				  System.out.println("value of x1:" + x1);  
				  System.out.println("value of y1:" + y1);
				  
				 //Check the given number is even or odd
				  
				  int eve=25;
				  //int odd=25;
				  
				  if (eve%2==0)
					  System.out.println("its even number");
				  else 
					  System.out.println("its odd number");
				  
				  //Java Program to Check Whether an Alphabet is Vowel or Consonant
				  
				  String str="a";
				  
						switch (str) {
						case "a":
							System.out.println("Provided value is Alphabet");
							break;
						case "e":
							System.out.println("Provided value is Alphabet");
							break;
							
						case "i":
							System.out.println("Provided value is Alphabet");
							break;
						case "o":
							System.out.println("Provided value is Alphabet");
							break;
						case "u":
							System.out.println("Provided value is Alphabet");
							break;
							
						default:
							System.out.println("Provided value is Consonant");
							break;
						}
				  

		}
		
	}



