package org.main;

import org.car.Car;
import org.motorcycle.MotorCycle;
import org.vehicle.Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		MotorCycle m = new MotorCycle();
		v.startEngine();
		v.stopEngine();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();
	}

}
