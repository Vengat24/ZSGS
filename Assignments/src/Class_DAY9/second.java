package Class_DAY9;

import java.util.ArrayList;
import java.util.List;

/*2. Create an Employee DTO class. Create appropriate
 *  instance variables, static variables and methods
 *  with appropriate access modifiers. Maintain encapsulation
 *  by giving controlled access to employee's PII.*/

class Emp{
	private String Name;
	private int Id;
	private long Phone;
	private String Email;
	private String Address;
	static final String Company = "Zoho";
	
	Emp(String name,int id,long phone,String email,String address) {
		Name = name;
		Id = id;
		Phone = phone;
		Email = email;
		Address = address;
	}
	
	
	public void getEmp() {
		System.out.println("Company  : " + Company);
		System.out.println("Name  : " + Name);
		System.out.println("Id  : " + Id);
		System.out.println("Phone  : " + Phone);
		System.out.println("Email  : " + Email);
		System.out.println("Address  : " + Address);
		System.out.println();
	}
	
}
public class second{
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("Vengatesh", 1, 9087366333l, "vengatesh@gmail.com", "Chennai"));
		list.add(new Emp("Vengat", 2,9878973624l, "vengat@gmail.com", "Madurai"));
		list.add(new Emp("Venkat", 3,8977464378l, "venkat@gmail.com", "Thenkasi"));
		
		for(Emp e:list) {
			e.getEmp();
		}
	}
}
