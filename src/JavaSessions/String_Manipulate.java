package JavaSessions;

public class String_Manipulate {

	public static void main(String[] args) {
		
		// Trim method will remove before space and after space not in between characters
		
		String tt="imran ";
		System.out.println(tt.trim());
		
		String test="    Hello World   ";
		//System.out.println(test.trim());
		System.out.println(test.replace(" ", ""));
		
		// touppercase or tolowercase	
		
		String up="imrankhantest";
		System.out.println(up.toUpperCase());
		
		//replace:
		
		String dob="20-09-1990"; 
		
			System.out.println(dob.replace('-', '/'));
		
		//contains
		String str="welcome admin user";
		
	     if (str.contains("admin")) {
	    	 System.out.println("pass");
	     }
	     else {
	    	 System.out.println("fail");
	     }
		
	     
	     //String comparison
	     
	     // equals and equals ignore case
	     
	     String p1="This is java   code";
	     String p2="this is java code";
	     
	     if(p1.equals(p2)) {
	    	 System.out.println("Both values are equal");
	     }
	     else {
	    	 System.out.println("Both values are not equal");
	     }
	    
	     if(p1.equalsIgnoreCase(p2)) {
	    	 System.out.println("Both values are equal");
	     }
	     else {
	    	 System.out.println("Both values are not equal");
	     }
	 
	     // Substring will give the expected string from the beging to ending or inbetween
	     
	     // Note if we want to take 1st ocurrence and 2nd and so on. Keep adding +1,+2..
	     String longMsg="hi this is imran and working on selenium";
	     
	     System.out.println(longMsg.substring(0, 7));
	     
	     String order="Your order number is 12345";
	     
	     int ord=order.indexOf("is")+3;
	     
	     System.out.println(order.substring(ord, order.length() ));
	     System.out.println(order.substring(ord));
	     
	     // Splitting the value on the basis of xX
	     
	     String st="xXRufatxXSureshXxXimran";
			
			String h1[]=st.split("xX");
			
			System.out.println(h1[0]);
			System.out.println(h1[1]);
			System.out.println(h1[2]);
			System.out.println(h1[3]);
	     
	     //split concept
	     
	     String lang="Java-Python-Ruby-JavaScript";
	     
	     String langArr[]=lang.split("-");
	     System.out.println(langArr.length);
	     System.out.println(langArr[2]);
	     
	     for(int i=0;i<langArr.length;i++) {
	    	 
	    	 System.out.println(langArr[i]);
	     }
	 
	     
	}

}