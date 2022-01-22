package JavaSessions;

public class Data_Conversion {

	public static void main(String[] args) {
		
		String x="100";
		
		System.out.println(x+20);
		// out put would be 10020 it will conatenate
		
		// String into integer
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		// output would be 120 now we did parse.
		//----------------------------------------------
		//Number format exception will come bcos int will store only numeric values
		
//		String y="100A";
//		int k=Integer.parseInt(y);
//		System.out.println(k+20);
		//----------------------
		
		String p="12.33";
		System.out.println(Double.parseDouble(p)+20);
		
		// int into string -->10020
		
		int t=1000;
		System.out.println(String.valueOf(t+20));
	}

}
