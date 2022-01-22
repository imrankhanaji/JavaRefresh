package JavaSessions;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company comp=new Company();
		
		String name=comp.getCompanyName();
		System.out.println(name);
		
		double price=comp.getCurrentMarketSharePrice();
		System.out.println(price);
		
		ArrayList<String> deptList=comp.getDeptList();
		System.out.println(deptList.size());
		
		for(String d:deptList) {
			
			System.out.println(d);
		}
		
		String members[]=comp.getBoardOfMembers();
		
			System.out.println(members.length);
			
		ArrayList<String> cofounderlist=comp.getCofounderList("MS");
		
		System.out.println(cofounderlist);
		
		int empcount=comp.getEmployeeCount("Zoomcar");
		
		System.out.println(empcount);
	}

}
