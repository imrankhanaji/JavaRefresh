package JavaSessions;

public class Array {

	public static void main(String[] args) {
		int i[] = new int[4];
		
		i[0]=30;
		i[1]=40;
		i[2]=50;
		i[3]=50;
		
		
		//System.out.println(i[0]+i[3]);
		System.out.println(i.length);
		
		for (int k=0;k<i.length;k++) {
		System.out.println(i[k]);
		
		}
		//Object Array
		
		Object obj[]=new Object[4];
		obj[0]="Imran Khan";
		obj[1]=30;
		obj[2]='M';
		obj[3]=false;
		
		for (int u=0;u<obj.length;u++) {
			System.out.println(obj[u]);
		}
		
		// String Array
		String str[]=new String[2];
		
		str[0]="imran";
		
		str[1]="khan";
		
		System.out.println(str.length);
		
		for(int n=0;n<str.length;n++) {
			
			System.out.println(str[n]);
			
		}
		
		
	}

}
