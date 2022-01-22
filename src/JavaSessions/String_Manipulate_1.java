package JavaSessions;

public class String_Manipulate_1 {

	public static void main(String[] args) {
		
		String data="imran;khan;32;chennai;india";
		
		for (int i=0;i<data.split(";").length;i++) {
			
			System.out.println(data.split(";")[i]);
		}
			
			
		
		

	}

}
