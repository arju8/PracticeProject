package com.testng;

import org.testng.annotations.Test;

public class Testng_InvocationCount {
	@Test(invocationCount=2)
	public void aMethod() {
		System.out.println("aMethod");
	}
	@Test(invocationCount=3)
	public void bMethod() {
		System.out.println("bMethod");

	}
	@Test(invocationCount=4)//runs 4 time
	public void cMethod() {
		System.out.println("cMethod");

	}
	@Test
	public void dMethod() {
		System.out.println("dMethod");

	}

}
