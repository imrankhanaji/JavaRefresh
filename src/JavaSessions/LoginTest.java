package JavaSessions;

public class LoginTest {

	public static void main(String[] args) {
		
		LoginTest lp=new LoginTest();
		
		lp.login("imran", "Test@123");
	}
	
	//method overloading also Poly + morphism--> Compile time polymorphism. Inside the object these methods are available.
	
	// A- Parent class having Start() method and B Child class having Start() method, compiler got confuse and 
	// it will take decision while compiling so its Dynamic/Run-Time polymorphism.
	
	
	public static void login() {
		
	}
	
	public static void login(String Username, String Password) {
		System.out.println("Credentials are" + " "+Username + " " +Password);
	}
	
	public static void login(int otp) {
		
	}
	
	public static void login(long phonenumber, String password) {
		
	}

}
