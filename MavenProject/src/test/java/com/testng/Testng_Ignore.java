package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_Ignore {
	@Ignore
	@Test
	public void aMethod() {
		System.out.println("A method");

	}
	@Test
	public void bMethod() {
   System.out.println("B method");
	}
	@Test
	public void cMethod() {
		System.out.println("c method");

	}
	@Test(enabled=false)
	public void dMethod() {
		System.out.println("D method");

	}

}
