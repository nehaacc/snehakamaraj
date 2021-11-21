package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Newpro {
	@BeforeClass
	public static  void beforeClass() {
		System.out.println("open bro");

	}
	@AfterClass
	public static void afterClass() {
		System.out.println("close bro");

	}
	@Before
	public void beforeMethod() {
		System.out.println("Before method");

	}
	@After
	public void afterMethod() {
     System.out.println("After Method");
	}
	@Test
	public void tc1() {
		System.out.println(1);
	}
	@Test
	public void tc2() {
    System.out.println(2);
	}
	@Test
	public void tc3() {
		System.out.println(3);

	}

}
