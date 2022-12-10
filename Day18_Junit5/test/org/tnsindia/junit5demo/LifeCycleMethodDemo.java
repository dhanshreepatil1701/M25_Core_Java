package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
interface LifeCycleMethodDemo {

	@Test
	default void display() {
		System.out.println("M25 batch");
	}
	@BeforeAll
	@Test
	default void print(){
		System.out.println("BeforeAll annotation executed before all thr testcase");
	}
	
	@AfterEach
	@Test
	default void accept() {
		System.out.println("AfterEach annotation executed before all thr testcase");
	}
}
