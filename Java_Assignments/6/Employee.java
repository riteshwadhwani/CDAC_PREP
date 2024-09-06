package Assignment4;

public class Employee {
	private String name;
	private int empid;
	private int salary;
	
	Employee(String name, int empid, int salary){
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	void taskManage() {
		System.out.println("Managing Task");
	}
	
}
