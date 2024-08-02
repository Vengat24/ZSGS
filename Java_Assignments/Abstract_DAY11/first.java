package Abstract_DAY11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee {
	int id;
	String Name;
	String Type;
	int salary;
	Employee(int id,String Name){
		this.id = id;
		this.Name = Name;
	}
	abstract int calculatePay();
	
	public void getEmployeeDetails() {
		salary = calculatePay();
		System.out.println("  ----------------------");
		System.out.println("  Id   : " + id + "\n  Name : "+ Name +"\n  Type : "+ Type+"\n  Salary : "+ salary);
		System.out.println("  ----------------------");
	}

}
class HourlyEmployee extends Employee{
	int pay = 200;
	int hour;
	HourlyEmployee(int id,String Name,int hour){
		super(id,Name);
		Type = "HourlyEmployee";
		this.hour = hour;
	}
	int calculatePay() {
		return pay*hour;
	}
}
class SalariedEmployee extends Employee{
	
	SalariedEmployee(int id,String Name){
		super(id,Name);
		Type = "SalariedEmployee";
	}
	int calculatePay() {
		return 40000;
	}
}
public class first{
	static Scanner obj = new Scanner(System.in);
	public static void main(String[] args) {
		user();
		
	}
	public static void user() {
		List<Employee> EmpList = new ArrayList<Employee>();
		
		int ch = 1;
		while(ch == 1 || ch == 2 ) {
			System.out.println("-------------------------------");
			System.out.println("1)Create Employee");
			System.out.println("2)View Employees");
			System.out.println("3)Exit");
			System.out.println("-------------------------------");
			System.out.print("Enter your Choice : ");
			ch = obj.nextInt();
			System.out.println("-------------------------------");
			if(ch == 1) {
				createUser(EmpList);
			}else if(ch == 2) {
				displayUser(EmpList);
			}else {
				System.out.println("Thank You!");
				break;
			}
		}
	}
	public static void createUser(List<Employee> EmpList) {
		int id=0;
		String name="";
		int pay = 0;
		System.out.print("Enter Your Id : ");
		id=obj.nextInt();
		System.out.print("Enter Your Name : ");
		name=obj.next();
		System.out.println("Available Employee Type :");
		System.out.println("1)HourlyEmployee");
		System.out.println("2)SalariedEmployee");
		System.out.print("Enter Employement Type (1/2): ");
		int ch=obj.nextInt();
		if(ch == 1) {
			System.out.print("Enter Hour of Work : ");
			int hour = obj.nextInt();
			EmpList.add(new HourlyEmployee(id,name,hour));
			
		}else if(ch == 2) {
			EmpList.add(new SalariedEmployee(id,name));
		}else {
			System.out.println("Invalid Type");
		}
		
		
	}
	public static void displayUser(List<Employee> EmpList) {
		System.out.println("Employees List : ");
		for(Employee Emp : EmpList) {
			Emp.getEmployeeDetails();
		}
	}
}












