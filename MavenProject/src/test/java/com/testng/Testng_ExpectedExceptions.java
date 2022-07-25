package com.testng;

import org.testng.annotations.Test;

public class Testng_ExpectedExceptions {

	@Test(expectedExceptions =ArithmeticException.class )
	public void aMethod() {
		int a=5/0;
		System.out.println("A method");

	}
	@Test
	public void bMethod()  {
		System.out.println("B method");
	}
	@Test
	public void cMethod() {
		System.out.println("c method");

	}
	@Test()
	public void dMethod() {
		System.out.println("D method");

	}




}
