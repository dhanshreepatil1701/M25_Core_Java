package org.tnsindia.junit5demo;

//demo on ParameterizedTest
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@DisplayName("Demo on Parameterized Test")
	@ParameterizedTest
	//source annotation
	@ValueSource(ints= {11,22,33})
	void display(int arg) {
		assertTrue(arg>10);
	}
	
	/*@ValueSource(floats= {11f,22f,33f})
	void display(float arg) {
		assertTrue(arg>10.0);
	}*/

}
