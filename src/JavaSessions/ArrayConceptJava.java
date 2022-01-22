package JavaSessions;

public class ArrayConceptJava {

	public static void main(String[] args) {
		
	//Static Array Default value will be printed in i[4]
		int i[]=new int[6];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=40;
		
		for (int k=0;k<i.length;k++) {
		//System.out.println(i[0]+i[1]);
		System.out.println(i[k]);
		}
		
		//double
		
		double d[]=new double[2];
			   d[0]=12;
			   d[1]=12.22;
		System.out.println(d[0]+d[1]);
		
		char c[]=new char[2];
			 c[0]='a';
			 c[1]='b';
			 
		System.out.println(c[0]);
		
		boolean b[]=new boolean[2];
				b[1]=true;
				//b[1]=false;
		System.out.println(b[1]);
		System.out.println("----------------");
		Object obj[]=new Object[6];
			   obj[0]="Imran";
			   obj[1]="25";
			   obj[2]="India";
			   obj[3]="20-Sep-1990";
			   obj[4]="M";
			   obj[5]="100.56";
			   
		for (int l=0;l<obj.length;l++) {
			System.out.println(obj[l]);
		}
	}

}
