package Day4;

public class person {
	String Name;
	int Age;
	String Address;
	person(String name){
		Name = name;
		System.out.println(Name);
	}
	person(String name,int age){
		Name = name;
		Age = age;
		System.out.println(Name + " " + Age );
	}
	person(String name,int age,String address){
		Name = name;
		Age = age;
		Address = address;
		System.out.println(Name + " " + Age + " "+ Address);
		
	}	
}
