package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertDemo {

	@Test
	public void assertdemo() {
		//fails when expected does not equal actual
		assertEquals(7,8);
		
	}
	@Test
	public void assertdemo1() {
		//fails when actual is not null
		assertNull(null);
	}

}
