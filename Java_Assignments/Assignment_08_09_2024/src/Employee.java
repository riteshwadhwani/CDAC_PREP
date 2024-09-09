
public class Employee {
private static int noOfEmployees = 0;
private static double totalSalaryExpenses = 0;
private String name;
private int empId;
private double salary;
	Employee(String name, int empId , double salary){
		Employee.noOfEmployees++;
		Employee.calculateTotalSalaryExpense(salary);
		this.name = name ;
		this.empId = empId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private static void calculateTotalSalaryExpense(double addition) {
		Employee.totalSalaryExpenses = Employee.totalSalaryExpenses + addition;
	}
	public static int  getTotalEmployees() {
		return Employee.noOfEmployees;
	}
	public static double  getTotalSalaryExpenses() {
		return Employee.totalSalaryExpenses;
	}
	public void applyRaise(double percentage) {
		double raise = this.salary * (percentage/100);
		Employee.calculateTotalSalaryExpense(raise);
		this.salary = this.salary + (raise);
	}
	public void updateSalary(double newSalary) {
		if(this.salary < newSalary) {
			double less = this.salary - newSalary; 
			Employee.totalSalaryExpenses -= less;
			this.salary = newSalary;
		}
		else {
			double more = newSalary - this.salary;
			Employee.totalSalaryExpenses += more;
			this.salary = newSalary;
		}
	}
	
	
}
