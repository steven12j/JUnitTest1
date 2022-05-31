package com.nexsoft.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MethodTest {
		
	//Prosedur Eksekusi JUnit
		
	@BeforeClass
	public static void methodBeforeClass() {
		System.out.println("Method Before Class");
	}
		
	@Before
	public void methodBefore() {
		System.out.println("Method Before");
	}
		
	@Test
	public void methodTest() {
		System.out.println("Method Test");
	}
		
	@Test
	public void methodTest2() {
		System.out.println("Method Test 2");
	}

	@Test
	public void methodTest3() {
		System.out.println("Method Test 3");
	}
	
	@After
	public void methodAfter() {
		System.out.println("Method After");
	}
		
	@AfterClass
	public static void methodAfterClass() {
		System.out.println("Method After Class");
	}

}
