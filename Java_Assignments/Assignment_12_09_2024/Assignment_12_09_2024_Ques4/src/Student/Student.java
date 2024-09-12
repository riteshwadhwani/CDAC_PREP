package Student;

public class Student {
	private String name;
	private int age;
	private int stuId;
	private String schoolName;
	
	Student(){
		this("",0,0,"");
	}
	Student(String name, int age, int stuId , String schoolName){
		this.name = name;
		this.age =age;
		this.stuId = stuId;
		this.schoolName = schoolName;
	}
	public void displayDetails() {
		System.out.println("Name of Student : " + this.name);
		System.out.println("Age of Student : " + this.age);
		System.out.println("Id of Student : " + this.stuId);
		System.out.println("School Name of Student : " + this.schoolName);
	}

}
