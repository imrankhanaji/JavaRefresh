package JavaSessions;

import java.util.ArrayList;

public class Company {
	
	public String getCompanyName() {
		
		return "IBM";
		
	}
	
	public double getCurrentMarketSharePrice() {
		
		return 12.22;
	}
	
	public ArrayList<String> getDeptList() {
		
		ArrayList<String> deptlist=new ArrayList<String>();
		
		deptlist.add("Admin");
		deptlist.add("IT");
		deptlist.add("HR");
		deptlist.add("Finance");
		deptlist.add("Sales");
		
		return deptlist;
		
	}
	
	public String[] getBoardOfMembers() {
		
		String boardarr[]=new String[3];
		
			boardarr[0]="Tom";
			boardarr[1]="Steve";
			boardarr[2]="Kan";
			
			return boardarr;
								
	}
	
	public ArrayList<Object>  getCompanyInfo() {
		
		ArrayList<Object> infoList=new ArrayList<Object>();
		
		infoList.add("IBM");
		infoList.add("Bangalore");
		infoList.add(10000);
		infoList.add("RFT");
		infoList.add(true);
		infoList.add(1990);
		
		return infoList;
		
	}
	
	// create a function where we need to pass the company name and then you return
	// total employees
	
	public int getEmployeeCount(String CompName) {
		
		int empcount=0;
		
		if(CompName.equals("IBM")) {
			empcount=1000;
			
		}else if(CompName.equals("Zoomcar")) {
			
			empcount=200;
		
		}else if(CompName.equals("HCL")) {
			
			empcount=10000;
		}else {
			
			System.out.println(CompName +  "not found. Plz pass the correct Company name");
			
	}
		
		return empcount;
		
	}
	
	// Create a function where we need to pass the company name and return co-founder list
	
	public  ArrayList<String>  getCofounderList(String CompName ) {
		
	 ArrayList<String> founderlist = new ArrayList<String>();
	 
		if(CompName.equals("Myntra")) {
			founderlist.add("Mukesh Bansal");
			founderlist.add("Binny Bansal");
			
		}else if(CompName.equals("HCL")) {
			
			founderlist.add("Shiv Nadar");
		
		}else if(CompName.equals("MS")) {
			
			founderlist.add("Bill Gates");
			founderlist.add("Steve Balmer");
		}else {
			
			System.out.println(CompName + " "+ "not found. Plz pass the correct Company name");
			
	}
		
		return founderlist;
		
		
	}
	
	}
	


