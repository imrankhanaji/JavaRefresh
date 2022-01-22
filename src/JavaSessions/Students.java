package JavaSessions;

public class Students {
	
	String name;
	int rollNumber;
	int marks;
	char gender;
	
	// can not create function inside a function
	
	public void setStudentName(String name) {
		this.name=name;
	}
	
	public String getStudentName() {
		 return name;
	}

	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.setStudentName("imran");
		String s1=obj.getStudentName();
		
		System.out.println(s1);
		
		
		
	}
	
	
	
}
