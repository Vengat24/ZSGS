package Inheritance_DAY10;
/*2. Design a Student Parent class and ZSGSStudent Child class.
 *  Create constructors in both class with varying number of
 *  parameters. Call parent constructor from child constructor.
 *  Try experimenting by creating child object using parent
 *  constructor.*/

class Student{
	String Name;
	String DOB;
	long Phone;
	Student(String name,String dob,long phone){
		Name = name;
		DOB = dob;
		Phone = phone;
	}
	void display() {
		System.out.println("Name : " +Name);
		System.out.println("DOB : " +DOB);
		System.out.println("Phone : " +Phone);	
	}
}
class ZSGSStudent extends Student{
	String Id;
	int Rate;
	ZSGSStudent(String name,String dob,long phone,String id,int rate){
		super(name,dob,phone);
		Id = id;
		Rate = rate;
	}
	void display() {
		System.out.println("Name : " +Name);
		System.out.println("DOB : " +DOB);
		System.out.println("Phone : " +Phone);
		System.out.println("Id : " +Id);
		System.out.println("Rate : " +Rate);
		
	}
}
public class second {

	public static void main(String[] args) {
		ZSGSStudent s1 = new ZSGSStudent("Vengatesh","24/10/2001",9087366333l,"ZSGS-0485",8);
		Student s2 = new Student("Vengat","04/10/2001",9087366333l);
		s1.display();
		s2.display();
	}

}
