package com.xworkz.recall.runner;

import com.xworkz.recall.app.Car;
import com.xworkz.recall.app.Roadways;
import com.xworkz.recall.app.Transportation;

public class TransportationRunner {

	public static void main(String[] args) {

		Transportation tr = new Roadways();
		tr.ways();
		Roadways.cast(tr);

		Roadways r = new Roadways();
		r.finalMethod();

		Car car = new Car();
		car.printInfo();

	}

}
