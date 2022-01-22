package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// str.reverse method not available for jave bcos string is immutable.
		String str="selenium";
		
		int len=str.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}

		System.out.println(rev);
	}
	

}
