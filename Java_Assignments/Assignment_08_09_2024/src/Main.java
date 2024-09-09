
public class Main {

	public static void main(String[] args) {
//		InstanceCounter c1 = new InstanceCounter();
//		InstanceCounter c2 = new InstanceCounter();
//		InstanceCounter c3 = new InstanceCounter();
//		System.out.println("No of Instances : " +InstanceCounter.getCounter());
		
//		Logger logger = Logger.getInstance();
//		logger.log("1 2 ka 4 4 2 ka 1");
//		System.out.println(logger.getLog());
//		logger.clearLog();
//		System.out.println(logger.getLog());
		
		Employee e = new Employee("Rahul",22,100000.20);
		System.out.println("Current Salary : "  + e.getSalary());
		e.applyRaise(12.5);
		System.out.println("Raised Salary : " + e.getSalary());
		e.updateSalary(110000);
		System.out.println("Update Salary : " + e.getSalary());
		
		System.out.println("No of employees" + Employee.getTotalEmployees());
		System.out.println("Total Salary Expenses : " + Employee.getTotalSalaryExpenses());
	}

}
