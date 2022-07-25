package com.testng;

import org.testng.annotations.Test;

public class Testng_Priority {

	@Test(priority=5)
	public void aMethod() {
		System.out.println("aMethod");
	}
	@Test(priority=0)//0 has the first priority and the next one which has no priority runs after o
	public void bMethod() {
		System.out.println("bMethod");
	}
	@Test(priority=4)
	public void cMethod() {
		System.out.println("cMethod");

	}
	@Test(priority=1)
	public void dMethod() {
		System.out.println("dMethod");

	}
	@Test
	public void eMethod() {
		System.out.println("eMethod");

	}

}
