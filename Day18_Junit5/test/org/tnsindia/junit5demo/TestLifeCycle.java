package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLifeCycle implements LifeCycleMethodDemo{

	@Test
	void fun() {
		System.out.println("First test cases");
	}

}
