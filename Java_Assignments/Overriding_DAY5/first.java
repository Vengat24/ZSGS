package Day5;

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
		System.out.println("Id " + id + " Name : "+ Name +" Type : "+ Type+"Pay : "+ salary);
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
	public static void main(String[] args) {
		Employee e1 = new HourlyEmployee(1,"Vengat",10);
		Employee e2 = new SalariedEmployee(2,"Vengatesh");
		e1.getEmployeeDetails();
		e2.getEmployeeDetails();
	}
}












