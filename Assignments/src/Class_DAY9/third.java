package Class_DAY9;
/*Create Flight DTO class. Create appropriate instance
 *  variables, static variables and methods with
 *   appropriate access modifiers.*/
class Flight{
	private String Name;
	private String DOB;
	private String PassportNo;
	private String Origin;
	private String Destination;
	
	public void setPass(String name,String dob,String passportNo, String origin,String destination) {
		Name = name;
		DOB = dob;
		PassportNo = passportNo;
		Origin = origin;
		Destination = destination;
	}
	public void getPass() {
		System.out.println("Name : "+Name);
		System.out.println("DOB : "+DOB);
		System.out.println("Passport No: "+PassportNo);
		System.out.println("Origin : "+Origin);
		System.out.println("Destination : "+Destination);
		
	}
}

public class third {

	public static void main(String[] args) {
		Flight f = new Flight();
		f.setPass("Vengat", "24/10/2001", "F10-CHEN", "Chennai", "Delhi");
		f.getPass();
	}

}
