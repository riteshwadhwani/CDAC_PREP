package org.main;

import org.animal.Animal;
import org.dog.Dog;

public class Main {
		public static void main(String[] args) {
			Dog d = new Dog();
			Animal a = new Animal();
			d.bark();
			d.eat(); //Here we have to override the eat method;
			d.sleep();//Here we have to override the sleep method;
			a.eat();
			a.sleep();
		}
}
