package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display() {
		//will evaluate the given assumption and if it result in true the given is executed result is true 
		System.setProperty("Dhanshree", "Dhan");
		Assumptions.assumeTrue("Dhan".equals(System.getProperty("Dhanshree")));
	}
	@Test
	void display1() {
		//will evaluate the given assumption and test will run if result is false
		System.setProperty("Dhanshree", "Dhan1");
		Assumptions.assumeFalse("Dhan".equals(System.getProperty("Dhanshree")));
	}
	
}
