package javaEmployee;

public class Employee {
	int id,salary;
	String name,department,address;
	

}
public class EmployeeDetails{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.id =305;
		e2.salary = 10000;
		e3.name = "Domae Sahu";
		e4.department ="CS";
		e5.address ="Abhanpur";
		
		System.out.println("Employee Id= " +" " + e1.id + " ");
		System.out.println("Employee Salary= " +" " + e2.salary + " ");
		System.out.println("Employee Name= " +" " + e3.name + " ");
		System.out.println("Employee Department= " +" " + e4.department + " ");
		System.out.println("Employee Address= " +" " + e5.address + " ");
	}
}
