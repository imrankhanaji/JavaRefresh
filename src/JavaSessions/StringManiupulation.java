package JavaSessions;

public class StringManiupulation {

	public static void main(String[] args) {
		
		String str="Hi mrani this is my java code and I am so Happy";
		
		System.out.println(str.length());
//		//System.out.println(str.chars()); Error thrown.
//		
		System.out.println(str.charAt(5));
//		System.out.println(str.indexOf('s')); //1st occurence of s
//		System.out.println(str.indexOf('s', 4));// 2nd occurenece of s and its hardcoded value. 
//		System.out.println(str.indexOf("s",str.indexOf('s')+1));
		
		//String Index out of bound exception for below 
		// System.out.println(str.charAt(41));
		System.out.println(str.indexOf("i", 0));
		System.out.println(str.indexOf("i", str.indexOf('i')+2));
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("naveen")); // this will retrun -1 bcos not found 
		String msg="welcome admin";
		
		String text=msg.toUpperCase();
		
		if (text.indexOf("admin")>0) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
			
		
	}
	

}

