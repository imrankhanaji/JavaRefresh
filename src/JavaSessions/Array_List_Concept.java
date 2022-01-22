package JavaSessions;

import java.util.ArrayList;

public class Array_List_Concept {

	public static void main(String[] args) {
		
		ArrayList<Object>ar=new ArrayList<Object>();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add("imran");
		ar.add(300);
		ar.add(600);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		ar.remove(2);
		System.out.println(ar.get(2));
		
		ArrayList<String> obj=new ArrayList<String>();
		
		obj.add("Khan");
		obj.add("Suresh");
		obj.add("Saran");
		obj.add("Saran");
		//obj.add(null);
		System.out.println("-----------");
		
		for (int i=0;i<obj.size();i++) {
			
			if (obj.get(i)!=null) 
				System.out.println("Null element not found"+ " " + obj.get(i));
			else if (obj.get(i).equals("Suresh"))
				System.out.println("Element found" + " "+ obj.get(i));
				
		//System.out.println(obj.get(i));
		}
		
//		for(String s: obj) {
//		 System.out.println(s);
//		}
		
	}

}

