package Assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Main {
	private static ArrayList<Person> getArrayList() {
		ArrayList<Person> arr = new ArrayList<>();
		arr.add(new Person("Ritesh",23));
		arr.add(new Person("Rahul",24));
		arr.add(new Person("Sahil",24));
		arr.add(new Person("Aditya",26));
		return arr;
	}
	private static int compareTo(Person a , Person b) {
//		System.out.println(a + " " + b);
		if(a.getAge()== b.getAge()) {
			return a.getName().compareTo(b.getName());
		}
		return a.getAge()-b.getAge();
	}
	public static void main(String[] args) {
		ArrayList<Person> list = getArrayList();
		
		Comparator<Person> cmp = Main::compareTo;
		
		Collections.sort(list,cmp);
		
		for(Person a : list) {
			System.out.println(a);
		}
		

	}

	

}
